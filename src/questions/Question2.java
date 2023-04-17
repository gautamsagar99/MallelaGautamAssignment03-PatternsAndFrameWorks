package questions;

class SuperClass{
	private String firstName;
	private String lastName;
	
	 protected String getFullName(String fName, String lName) {
		return fName + "," + lName;
	}
}

public class Question2 extends SuperClass{
	
	private String firstName;
	private String lastName;
	
	private Question2(String fName, String lName) {
		this.firstName = fName;
		this.lastName = lName;
	}
	
	@Override
	private String getFullName(String fName, String lName) {
		return this.firstName + " " + this.lastName;
		
	}

	public static void main(String[] args) {
		Question2 q2 = new Question2("gautam", "sagar");
		System.out.println(q2.getFullName("gautam", "sagar"));

	}

}
