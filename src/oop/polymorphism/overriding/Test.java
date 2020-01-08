package oop.polymorphism.overriding;

public class Test {
    public static void main(String[] args) {
        Cat myCat=new Cat();
        myCat.animalSound();

        Cat yourCat=new Cat();
        yourCat.animalSound();

        Dog myDog=new Dog();
        myDog.animalSound();
        myDog.eats();

        Animal herCat=new Animal();
        herCat.animalSound();




    }
}
