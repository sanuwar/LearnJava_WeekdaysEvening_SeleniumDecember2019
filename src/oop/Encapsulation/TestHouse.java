package oop.Encapsulation;

public class TestHouse {
    public static void main(String[] args) {
        // create object of House class
        House bushrasHouse=new House("Bushra");
        // we set variable value
        bushrasHouse.setStreetAddress("25st Jamaica");
        // we get variable value
        System.out.println( bushrasHouse.getStreetAddress());



    }
}
