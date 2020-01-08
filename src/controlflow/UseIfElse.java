package controlflow;

public class UseIfElse {

	// Control Flow:
	// If..else
	// If elseIF..else
	// Nested If..else

	// if..else
	// if(condition){ // block of code}

	public static void main(String[] args) {

		int number = 26;
		int number1 = 28;

		if (number == 26) {
			System.out.println("Number is Equal to 25");

			if (number1 == 27) {
				System.out.println("Number1 is Equal to 27");
			} else {
				System.out.println("Number1 is not Equal to 27");
			}

		} else {
			System.out.println("Number is not Equal to 25");
		}

	}

}
