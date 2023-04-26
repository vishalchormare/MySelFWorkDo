package practiescDoWhileLoop;

public class StudentC {

	int rollNumber;
	String firstName;
	String lastName;

	public StudentC(int rollNumber, String firstName, String lastName) {

		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	void display() {
		System.out.println("Student Roll Number" + " " + rollNumber);
		System.out.println("Student First Name" + " " + firstName);
		System.out.println("Student Last Name" + " " + lastName);
	}

	@Override
	public String toString() {
		return "StudentC [rollNumber=" + rollNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
