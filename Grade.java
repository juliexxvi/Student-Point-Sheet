package School;

public class Grade {
	private int id;
	private String gradeName;
	private String gradeRoom;
	private int primaryTeacherId;
	
	public Grade() {
		
	}

	public Grade(int id, String gradeName, String gradeRoom, int primaryTeacherId) {
		super();
		this.id = id;
		this.gradeName = gradeName;
		this.gradeRoom = gradeRoom;
		this.primaryTeacherId = primaryTeacherId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	public String getGradeRoom() {
		return gradeRoom;
	}

	public void setGradeRoom(String gradeRoom) {
		this.gradeRoom = gradeRoom;
	}

	public int getPrimaryTeacherId() {
		return primaryTeacherId;
	}

	public void setPrimaryTeacherId(int primaryTeacherId) {
		this.primaryTeacherId = primaryTeacherId;
	}

	

	
}
