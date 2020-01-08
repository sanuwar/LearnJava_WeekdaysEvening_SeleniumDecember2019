package basic;

public class UseVariable {

	// Variable:
	// Global Variable/ Reference variable:
	// Local Variable:
	// Class Variable: By using static keyword
	// Non Static variable:

	String stName, stAddress; // Declare Variable

	// Gloabal Variable
	String name = "Aroz"; // Declare and Initialized value
	int number = 125; //
	static String address = "Queens,NY";// class variable

	public void display() {
		int tvSize = 65; // Local variable
		name = "Fahim";
		stName = "Rasel";
	}

	public static void main(String[] args) {

		String teacherName = "James williams";
		String teacherAddress = "Astoria, NY";
		// Concatenation
		System.out.println("Teacher Name is : " + teacherName + " " + "Address is : " + teacherAddress);
		System.out.println("Address is : " + teacherAddress);

	}

}
