package basic;

public class UseConstractor {

	// constructor: is used to initialize object
	// Constructor name should be className
	// Constructor has no return type
	// AccessModifier constructorName(){}

	String name;
	String address;
	String mobile;
	int age;
	double height = 5.4;

	public UseConstractor() {
		// Default constructor
		System.out.println("This is Default constructor");
	}

	// Parametarized Constructor
	public UseConstractor(String name, String address) {
		this.name = name;
		this.address = address;
		System.out.println("Name is : " + name + " " + "Address is " + address);
	}

	public UseConstractor(String name, String address, String mobile) {
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		System.out.println("Name is : " + name + " " + "Address is " + address + " " + "Mobile Number :" + mobile);
	}

	public UseConstractor(String mobile, String name, int age) {
		this.name = name;
		this.mobile = mobile;
		this.age = age;
		System.out.println("Name is : " + name + " " + "Mobile is " + mobile + " " + "Age is " + age);
	}

	int b; // declare variable
	int a = 5; // Declare and initialize

	public static void main(String[] args) {
		// Object:
		// className objectName=new constructorOfClass();
		// UseConstractor uc = new UseConstractor();

		UseConstractor fahimObj = new UseConstractor("Fahim", "Queens,NY");

		UseConstractor bushra = new UseConstractor("Bushra", "Jamica,NY", "5461668");
		UseConstractor aroz = new UseConstractor("468615", "Aroz", 25);

		// UseConstractor ucd = new UseConstractor();

	}

}
