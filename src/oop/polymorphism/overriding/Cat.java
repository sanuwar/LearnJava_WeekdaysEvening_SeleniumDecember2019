package oop.polymorphism.overriding;

public class Cat  extends Animal{
    // If we use override then it will ride during runtime
    //If we do not use override then it will ride after runtime


    /**
     * Class Cat is overriding the 'animalSound' method from its parent class (Animal).
     */
@Override
    public void animalSound(){
    System.out.println("My Cat is a Animal");
}




}
