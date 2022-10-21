package School;

public class ExamPoint {
	private int id;
	private int studentId;
	private int points;
	private String examType;
	private String semester;
	private String subject;
	private int muliplication;
	
	public ExamPoint() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStudentId() { 
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public String getExamType() {
		return examType;
	}

	public void setExamType(String examType) {
		this.examType = examType;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getMuliplication() {
		return muliplication;
	}

	public void setMuliplication(int muliplication) {
		this.muliplication = muliplication;
	}

	public ExamPoint(int id, int studentId, int points, String examType, String semester, String subject,
			int muliplication) {
		super();
		this.id = id;
		this.studentId = studentId;
		this.points = points;
		this.examType = examType;
		this.semester = semester;
		this.subject = subject;
		this.muliplication = muliplication;
	}

	
}
