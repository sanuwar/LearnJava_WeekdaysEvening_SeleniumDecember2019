package recursion;

public class Pizza {
    //Recursion: process in which a method calls itself continuously.
    // must call itself
    // must have a base case
    // must change its state and move toward the base case

// public void display(){display();}

 static int count =0;


    public static void main(String[] args) {
        Pizza.pizzaInfo();


    }


    public static void pizzaInfo() {
        count++;

        if (count<=10){
            // non return type
            System.out.println("American Pizza is good"+count);
            pizzaInfo();// Recursion
        }



    }

}
