
public class User {
	int id;
	String firstName;
	String lastName;
	String email;
	String phoneNumber;
	String adress;
	String age;
	
	public User() {
		
	}
	
	public User(int id, String firstName, String lastName, String email, String phoneNumber, String adress, String age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email =email;
		this.phoneNumber = phoneNumber;
		this.adress = adress;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
	

}
