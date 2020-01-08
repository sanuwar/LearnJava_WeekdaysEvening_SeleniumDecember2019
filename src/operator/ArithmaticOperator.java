package operator;

public class ArithmaticOperator {

	public static void main(String[] args) {
		// Arithmatic Operator
		// + - * /
		// %

		int number1 = 150;
		int number2 = 16;
		int addition = number1 + number2;
		System.out.println("Addition value is " + addition);

		int substraction = number1 - number2;
		System.out.println("Substration value is " + substraction);

		int multiply = number2 * number1;
		System.out.println("Multiply value is " + multiply);

		int division = number1 / number2;
		System.out.println("Division value is " + division);

		int reminder = number1 % number2;
		System.out.println("Remainder value is " + reminder);

	}
}
