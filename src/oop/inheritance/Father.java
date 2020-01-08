package oop.inheritance;

public class Father extends GrandFather {

    // Single level inheritance
    /**
     * This Father class inherits from Grandfather class (Super class).
     * This means that the Father class has access to Grandfather class's public variables & methods.
     */

    public String favouriteActivity="Reading Book";
    private long fatherSSN=48683369;

    public Father() {

    }



    public void tellJockes(){
        System.out.println("Father can tell jokes");
    }

    public void educate(){
        System.out.println("Father can educate others");
    }


}
