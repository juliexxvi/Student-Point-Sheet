package School;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

	public static void main(String[] args) {
		Grade grade1 = new Grade(1, "6A2", "101", 0);
		Grade grade2 = new Grade(2, "7A2", "202", 0);

		Teacher teacher1 = new Teacher(1, "Dung Nguyen", "Information Technology");
		Teacher teacher2 = new Teacher(2, "Hai Yen Nguyen", "Math");

		Student julie = new Student(888, 0, "Julie Nguyen", "Sydney, Australia", "female");
		Student aaron = new Student(999, 0, "Aaron Nguyen", "Melbourne, Australia", "male");

		julie.setGradeId(grade1.getId());
		grade1.setPrimaryTeacherId(teacher1.getId());

		Student[] students = { julie, aaron };
		Grade[] grades = { grade1, grade2 };
		Teacher[] teachers = { teacher1, teacher2 };

		List<ExamPoint> examPoints = new ArrayList<ExamPoint>();
		String[] examNames = { "Mat", "Eng", "Sci" };
		String[] examTypes = { "15'", "45'", "Mid", "Final" };
		String[] semesters = { "Semester 1", "Semester 2" };
		int[] multiplications = { 1, 2, 2, 3 };

		int examPointId = 1;

		for (String examName : examNames) {
			for (int i = 0; i < examTypes.length; i++) {
				for (String semester : semesters) {
					for (Student student : students) {
						int randomPoints = ThreadLocalRandom.current().nextInt(3, 11);
						ExamPoint examPoint = new ExamPoint(examPointId, student.getId(), randomPoints, examTypes[i],
								semester, examName, multiplications[i]);
						examPointId++;
						examPoints.add(examPoint);
					}
				}
			}
		}

		System.out.println("POINT SHEET");
		Student student = getStudentById(888, students);
		Grade grade = getGradeById(student.getGradeId(), grades);
		Teacher teacher = getTeacherbyId(grade.getPrimaryTeacherId(), teachers);
		System.out.println("Student name: " + student.getStudentName());
		System.out.println("Grade: " + grade.getGradeName());
		System.out.println("Primary Teacher: " + teacher.getTeacherName());

		List<ExamPoint> studentAllExamPoints = getExamPointsFromStudentId(student.getId(), examPoints);

		System.out.println(
				"|| Subject ||             Semester 1                   ||              Semester 2                  | Average ||");
		System.out.print(
				"||---------||------------------------------------------||------------------------------------------|----------");
		System.out.println();
		System.out.print("||         |");
		for (String semester : semesters) {
			for (int i = 0; i < examTypes.length; i++) {
				if (examTypes[i].equals("Final")) {
					System.out.print("| " + examTypes[i] + "(" + multiplications[i] + ")|");
				} else {
					System.out.print("| " + examTypes[i] + "(" + multiplications[i] + ")  |");
				}
			}
		}
		System.out.print("         ||");
		double finalAverageSum = 0;
		System.out.println();
		for (String subject : examNames) {
			int sum = 0;
			System.out.print("||   " + subject + "   |");
			for (String semester : semesters) {
				for (int i = 0; i < examTypes.length; i++) {
					for (ExamPoint examPoint : studentAllExamPoints) {
						if (examPoint.getSubject().equals(subject) && examPoint.getSemester().equals(semester)
								&& examPoint.getExamType().equals(examTypes[i])
								&& examPoint.getMuliplication() == multiplications[i]) {
							sum += examPoint.getPoints() * examPoint.getMuliplication();
							if (examPoint.getPoints() < 10) {
								System.out.print("|   " + examPoint.getPoints() + "     |");
							} else {
								System.out.print("|   " + examPoint.getPoints() + "    |");
							}
						}
					}
				}
			}
			double average = Math.round((double) sum / 16 * 100.0) / 100.0;
			System.out.print("   " + average + "  ||");
			System.out.println();
			finalAverageSum += average;
		}
		System.out.println(
				"===============================================================================================================");
		double finalAverage = Math.round((double) finalAverageSum / 3 * 100.0) / 100.0;
		System.out.println("Average point: " + finalAverage);
	}

	// ----------- Reusable Functions --------------

	public static List<ExamPoint> getExamPointsFromStudentId(int studentId, List<ExamPoint> examPoints) {
		List<ExamPoint> list = new ArrayList<ExamPoint>();

		for (ExamPoint points : examPoints) {
			if (points.getStudentId() == studentId) {
				list.add(points);
			}
		}
		return list;
	}

	public static Student getStudentById(int studentId, Student[] students) {
		for (Student student : students) {
			if (student.getId() == studentId) {
				return student;
			}
		}
		return null;
	}

	public static Grade getGradeById(int gradeId, Grade[] grades) {
		for (Grade grade : grades) {
			if (grade.getId() == gradeId) {
				return grade;
			}
		}
		return null;
	}

	public static Teacher getTeacherbyId(int teacherId, Teacher[] teachers) {
		for (Teacher teacher : teachers) {
			if (teacher.getId() == teacherId) {
				return teacher;
			}
		}
		return null;
	}

}
