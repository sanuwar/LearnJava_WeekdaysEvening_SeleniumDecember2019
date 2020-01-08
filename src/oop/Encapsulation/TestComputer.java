package oop.Encapsulation;

public class TestComputer {
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.isAvailable=true;

        // Setter Getter
        // First Need to set Value
        computer.setComputerName("Fahim computer");
        // For Print we Need get variable Name/ get Method
        System.out.println(computer.getComputerName());



    }
}
