package basic;

public class Student {

	String stName;
	String stIDString;

	int stContact;
	double courseFee;

	public Student(String stName) {
		this.stName = stName;
	}

	public Student(String stName, String stIDString) {
		this.stName = stName;
		this.stIDString = stIDString;
	}

	public Student(String stName, String stIDString, int stContact) {
		this.stName = stName;
		this.stIDString = stIDString;
		this.stContact = stContact;
	}

	public Student(String stName, double courseFee) {
		this.stName = stName;
		this.courseFee = courseFee;
	}

	public Student(String stName, String stIDString, int stContact, double courseFee) {
		this.stName = stName;
		this.stIDString = stIDString;
		this.stContact = stContact;
		this.courseFee = courseFee;
	}

}
