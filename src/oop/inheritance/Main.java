package oop.inheritance;

public class Main {
    public static void main(String[] args) {
        Son jony=new Son();
        jony.jump();
        jony.height();


        // Type indicating all the methods from that class


        GrandFather fahim=new Son();
        fahim.hairColor();
        ((Son) fahim).learning(); // Type is converted to Son class, its casting.

        Father tarik=new Son();
        tarik.educate();


       // Father obj=new GrandFather(); // GrandFather is not inherit Father






    }
}
