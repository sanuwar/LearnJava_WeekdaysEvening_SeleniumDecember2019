package basic;

public class UseCasting {

	// Casting: convert Data Type
	public static void main(String[] args) {

		int number = 50;

		double salary = number;
		System.out.println(salary);
		double newSalary = number;

		int income = (int) salary;
		System.out.println(income);

		double courseFee = 5000.500;
		int fee = (int) courseFee;
		System.out.println(fee);

	}

}
