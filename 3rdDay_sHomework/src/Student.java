
public class Student extends User {
	String studentNumber;
	String profession;
	
	public Student() {
		
	}
	
	public Student(String studentNumber, String profession) {
		super();
		this.studentNumber = studentNumber;
		this.profession = profession;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	

}
