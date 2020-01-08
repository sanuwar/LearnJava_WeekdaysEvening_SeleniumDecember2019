package basic;

import java.util.Scanner;

public class StaticVariableAndMethod {

    // Static:
    // Static is used to make any variable and method static so that we do not need to create object
    // static variable is called class variable
    // static method is called class method

    public String name="Jony";
    public static String address="Jamaica,NY";

    int number1=50;
    int number2=60;
    int number3=number2=70;
    int number4=number2+number3;
    int number5=number4;


    public static void main(String[] args) {
        StaticVariableAndMethod.address="Astoria,NY";
        System.out.println(StaticVariableAndMethod.address);

       // StaticVariableAndMethod.checkEligibility();

        StaticVariableAndMethod svm=new StaticVariableAndMethod();
        svm.checkEligibility();

        svm.name="James william";
        System.out.println(svm.name="Jack");
        svm.name="Denis";
        String newName=svm.name;
        System.out.println(newName);

        String newName1=svm.name="Denis";
        //String newName=svm.name;
        System.out.println(newName1);


    }

    public  void checkEligibility() {

        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age?");
        age = sc.nextInt();
        if (age >= 18)
            System.out.println("You are eligible to vote.");
        else
            System.out.println("You are not eligible to vote.");


    }

    public void displayName(){
        this.name="Aroz";
    }

}
