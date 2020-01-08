package recursion;

public class Pizza {
    //Recursion: process in which a method calls itself continuously.

// public void display(){display();}


    public static void main(String[] args) {
        Pizza.pizzaInfo();


    }


    public static void pizzaInfo() {
        // non return type
        System.out.println("American Pizza is good");
        pizzaInfo();// Recursion

    }

}
