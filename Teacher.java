package School;

public class Teacher {
	private int id;
	private String teacherName;
	private String subject;
	
	public Teacher() {
		
	}

	public Teacher(int id, String teacherName, String subject) {
		super();
		this.id = id;
		this.teacherName = teacherName;
		this.subject = subject;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}
