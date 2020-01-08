package oop.polymorphism.overloading;

public class Test {

    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.doSummation(45,56);
        calculator.doSummation(44,57,27);
        calculator.doSummation(88,78,63,19);
    }
}
