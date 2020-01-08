package oop.abstraction;

public class Test {


    public static void main(String[] args) {
        int number=45;

        Toyota toyota=new Toyota();
        toyota.carStart();
        toyota.carEngine();
        toyota.carWheel();
        toyota.display();
        toyota.carStop();
        toyota.flyingFeature();
        toyota.boostEngine();

        // Car type
        Car myCar=new Toyota();
        myCar.carStart();
        myCar.carEngine();
        myCar.carStop();
        myCar.carWheel();
        myCar.carEngine();
        ((Toyota) myCar).display();// casting





    }


}
