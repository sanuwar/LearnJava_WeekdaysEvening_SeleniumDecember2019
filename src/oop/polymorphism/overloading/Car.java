package oop.polymorphism.overloading;

public class Car {
//polymorphism means many forms

// Method Overloading:

    public void carStart(){
        System.out.println("Car start");
    }
    public void carStart(String carKey){
        System.out.println("To start a car we need"+carKey);
    }
    public void carStart(String carKey, String carReverse){
        System.out.println("To start a car we need"+carKey+" "+"To Reverse car "+carReverse);
    }




}
