package oop.Encapsulation;

public class House {

    private String houseOwnerName, streetAddress;
//private String streetAddress;

    private int numOfBedrooms;
    private int numOfFloors;


    public House() {
        // Default constructor
        this.houseOwnerName="Bushra";
        this.streetAddress="34st Manhattan";
        this.numOfBedrooms=3;
        this.numOfFloors=5;

    }
    public House(String houseOwnerName) {
        // Parametarized constructor
        this.houseOwnerName=houseOwnerName;
    }

    // Getter and Setter
    // Create getters and setters for retrieving and setting data
    // This is the proper way of interacting with data of a class


    public String getHouseOwnerName() {
        return houseOwnerName;
    }

    public void setHouseOwnerName(String houseOwnerName) {
        this.houseOwnerName = houseOwnerName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public int getNumOfBedrooms() {
        return numOfBedrooms;
    }

    public void setNumOfBedrooms(int numOfBedrooms) {
        this.numOfBedrooms = numOfBedrooms;
    }

    public int getNumOfFloors() {
        return numOfFloors;
    }

    public void setNumOfFloors(int numOfFloors) {
        this.numOfFloors = numOfFloors;
    }
}
