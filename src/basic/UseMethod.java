package basic;

public class UseMethod {

	// Method:

	// Return Type Method
	// Non Retype Method

	// Return Type Method:
	// Non Parametarized Return Method
	// Parametarized Return Method

	// Non Return Type Method:
	// Non Parametarized Non Return Method
	// Parametarized Non Return Method

	// Non Parametarized Return Method
	// AcessModifier ReturnType MethodName (){ // body }
	// Method Name= verb+Noun

	// int summation;

	public double doSummation() {
		int number1 = 50;
		int number2 = 70;
		int summation = number1 + number2;
		System.out.println("Summation of Two Value is : " + summation);
		return summation;
	}

	// Parametarized Return Method

	public double doSummation(int num1, int num2) {
		int number1 = num1;
		int number2 = num2;
		int summation = number1 + number2;
		System.out.println("Summation of Two Value is : " + summation);
		return summation;
	}

	public static double doMulply(double num1, double num2) {
		double number1 = num1;
		double number2 = num2;
		double multiply = number1 * number2;
		System.out.println("Multiplied of Two Value is : " + multiply);
		return multiply;
	}

	// Non Return Type Method:
	// Non Parametarized Non Return Method
	// AccessModifier ReturnType nameOfMethod(){ }

	public void doDivision() {
		double number1 = 80;
		double number2 = 25;
		double division = number1 / number2;
		System.out.println("Division Value is : " + division);
		System.out.println("Jony is learning non return method");
	}

	// Parametarized Non Return Method
	double number1;
	double number2;

	public void doDivision(double number1, double number2) {
		this.number1 = number1;
		this.number2 = number2;
		double division = number1 / number2;
		System.out.println("Division Value is : " + division);
	}

	public static void main(String[] args) {
		// Object:
		// className objectName=new constructorOfClass();

		UseMethod obj = new UseMethod();

		obj.doSummation();
		obj.doSummation(10, 5555);
		UseMethod.doMulply(300, 20);
		obj.doDivision();
		obj.doDivision(500, 10);
		System.out.println("Summmation of " + obj.doSummation());
		// System.out.println("Summmation of " + obj.doDivision());

		// System.out.println(obj.summation);

	}

}
