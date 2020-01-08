package oop.inheritance;

public class Son extends Father {
    // Multi level inheritance
    /**
     * This Son class inherits from Father class which inherits from Grandfather class.
     * This means that the Son class has access to Father and Grandfather class's public variables & methods.
     */

public String favouriteGame="Flying kite";
private long sonSSN=35648168;

    public Son() {

    }
    public void playing(){
        System.out.println("Son is Playing");
    }

    public void learning(){
        System.out.println("Son is learning Java");
    }



}
