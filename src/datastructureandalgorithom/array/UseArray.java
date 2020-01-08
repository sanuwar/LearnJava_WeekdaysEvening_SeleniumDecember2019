package datastructureandalgorithom.array;

public class UseArray {


    static String name;


    public static void main(String[] args) {
        name = "james";
        //Array Declare: DataType[] nameOfArray=new DataType[arrayLength];
        String[] stName = new String[40];// Declare an Array with length or size
        stName[5] = "Aroz"; // Initialize a value
        stName[6] = "Abir";
        stName[7] = "Jonny";
        stName[8] = "Rocky";
        stName[9] = "Zahid";
        stName[10] = "Jewel";
        stName[0] = "Kollol";
        stName[1] = "Fahim";
        stName[2] = "Bushra";
        stName[3] = "Robin";
        stName[4] = "Tarik";
        stName[11] = "Zahirul";
        stName[12] = null;
        System.out.println(stName[1]);
        System.out.println(stName[6]+" "+stName[7]);
        System.out.println(stName.length);
        //System.out.println(stName.clone());

        String[] carName={"Toyota","BMW","Tesla","Lexus","Audi"};
        System.out.println(carName.length);

        // For Loop
        for (int i=0;i<stName.length;i++){
            System.out.println(stName[i]);
        }

        // For each loop
        for (String st:carName) {
            System.out.println(st);
        }












    }

}
