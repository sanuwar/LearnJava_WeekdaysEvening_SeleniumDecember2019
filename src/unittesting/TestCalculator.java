package unittesting;

import org.junit.Assert;

public class TestCalculator {

    public static void main(String[] args) {
        // Unit Testing
        Calculator calculator=new Calculator();
        int additionResult=calculator.addition(15,25);

        Assert.assertEquals(additionResult,40);
        System.out.println("Addition is pass");

        int subResult=calculator.subtraction(500,400);
        Assert.assertEquals(subResult,100);
        System.out.println("Subtration is pass");

    }





}
