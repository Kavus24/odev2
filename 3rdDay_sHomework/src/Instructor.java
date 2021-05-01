
public class Instructor extends User {
	String courses;
	String students;
	
	public Instructor() {
		
	}
	
	public Instructor(String courses, String students) {
		super();
		this.courses = courses;
		this.students = students;
	}
	public String getCourses() {
		return courses;
	}
	public void setCourses(String courses) {
		this.courses = courses;
	}
	public String getStudents() {
		return students;
	}
	
}
