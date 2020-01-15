package reviewjava;

public class UseCasting {
    static String name="4654.25";

    static double salary= Double.parseDouble(name);
    static float courseFee= Float.parseFloat(name);

    double coffeePrice=12.50;
    int discountedCoffeePrice=(int) coffeePrice;



    public static void main(String[] args) {
        System.out.println(salary);
    }


}
