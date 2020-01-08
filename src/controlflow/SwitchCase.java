package controlflow;

public class SwitchCase {

	// Switch Case

	public static void main(String[] args) {

		int menuNumber = 5;
		String foodName;

		switch (menuNumber) {
		case 1:
			foodName = "Coffee";
			break;
		case 2:
			foodName = "Burger";
			break;
		case 3:
			foodName = "Pizza";
			break;
		case 4:
			foodName = "Fried Rice";
			break;
		case 5:
			foodName = "French Fry and Cold Drinks";
			break;
		case 6:
			foodName = "Mack & Cheese";
			break;
		default:
			foodName = "Invalid Item";
			break;
		}
		System.out.println("Your Food Name is " + foodName);

	}

}
