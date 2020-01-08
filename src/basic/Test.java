package basic;

public class Test {

	public static void main(String[] args) {
		UseMethod myObj = new UseMethod();
		myObj.doDivision(105.50, 15.5);
		myObj.doDivision();

		UseMethod.doMulply(25.5, 14.5);

		UseDataType dt = new UseDataType();
		dt.phone = "846883165";
		// dt.id=526;
		dt.email = "bcd@gmail.com";

	}

}
