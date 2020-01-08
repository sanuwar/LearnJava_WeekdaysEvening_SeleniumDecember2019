package operator;

public class ConditionalOperator {
	// AND Operator: &&
	// OR Operator: ||

	public static void main(String[] args) {

		int value1 = 10;
		int value2 = 20;

		// AND Operator
		if ((value1 == 10) && (value2 == 20)) {
			System.out.println("Value1 is 10 and Value2 is 20");
		}
		if (((value1 == 10) && (value2 == 20)) || (value2 == 25)) {
			System.out.println("Value1 is 10 and Value2 is 20");
		}
		// OR Operator
		if ((value1 == 11) || (value2 == 20)) {
			System.out.println("Value1 is 10 and Value2 is 20");
		}

	}

}
