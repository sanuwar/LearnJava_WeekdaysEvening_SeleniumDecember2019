package oop.inheritance;

public class Car {

    String carName;
    String carBrand;
    int carModel;
    boolean isAvailable;

    public void carStart() {
        System.out.println("Car start ");
    }

    public void carStop() {
        System.out.println("Car stop ");
    }

    public String carInfo(String carName, String carBrand) {
        String carDetails = carName + " " + carBrand;
        System.out.println(carDetails);
        return carDetails;
    }


}
