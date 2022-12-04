package OOSEAssignment;

public class Person {
	protected String username,password,firstName,lastName,IC,email,telNum;
	
	public void setDetails(String firstName,String lastName,String IC, String email, String telNum) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.IC=IC;
		this.email=email;
		this.telNum=telNum;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getIC() {
		return IC;
	}
	public String getEmail() {
		return email;
	}
	public String getTelNum() {
		return telNum;
	}
}
