package oop.inheritance;

public class TestBmw {


    public static void main(String[] args) {
        Bmw jonhyBmw=new Bmw();
        jonhyBmw.carInfo("BMW 3","BMW");

        Car fahimBmw=new Bmw();
        fahimBmw.carStart();
        fahimBmw.carStop();
        fahimBmw.carBrand="BMW";
        System.out.println(fahimBmw.carBrand);

        Car myCar=new Car();
        myCar.isAvailable=true;
        myCar.carStart();



    }



}
