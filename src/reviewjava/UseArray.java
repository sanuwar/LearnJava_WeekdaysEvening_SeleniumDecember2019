package reviewjava;

import java.util.ArrayList;
import java.util.List;

public class UseArray {



    public static void main(String[] args) {
        // Array:
        int[] number={1,4,3,6,9}; // declare and Initialize value in array
        String [] name=new String[5]; // Declare Array with size
        name[0]="Fahim";
        name[1]="Aroz";
        name[2]="Rasel";
        name[3]="Kollol";
        name[4]="Zahirul";

        for (int i=0; i<name.length;i++){
            System.out.println(name[i]);
        }

        System.out.println(name[3]);
        System.out.println(name);



        // ArrayList

        ArrayList<String> clothingList=new ArrayList<>();
        clothingList.add("T-shirt");
        clothingList.add("Pant");
        clothingList.add("Shirt");
        clothingList.add("Sweater");

        for (String st:clothingList) {
            System.out.println(st);
        }
        // List
        List<String> fruitesList=new ArrayList<>();
        fruitesList.add("Mango");
        fruitesList.add("Banana");
        fruitesList.add("Orange");
        fruitesList.add("Apple");

        for (String st:fruitesList) {
            System.out.println(st);
        }



    // 2D Array

    String[][] stName=new String[5][4];
        stName[0][0]="Sl";
        stName[0][1]="First Name";
        stName[0][2]="Last Name";
        stName[0][3]="Grade";

        stName[1][0]="1";
        stName[1][1]="Fahim";
        stName[1][2]="Zaman";
        stName[1][3]="A";

        stName[2][0]="2";
        stName[2][1]="Bushra";
        stName[2][2]="Karim";
        stName[2][3]="A-";

        System.out.println(stName[2][2]);




    }

}
