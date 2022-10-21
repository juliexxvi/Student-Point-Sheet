package School;

public class Student {
	private int id;
	private int gradeId;
	private String studentName;
	private String studentAddress;
	private String gender;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGradeId() {
		return gradeId;
	}

	public void setGradeId(int gradeId) {
		this.gradeId = gradeId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Student(int id, int gradeId, String studentName, String studentAddress, String gender) {
		super();
		this.id = id;
		this.gradeId = gradeId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.gender = gender;
	}


	
}
