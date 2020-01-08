package loop;

import java.util.ArrayList;
import java.util.List;

public class UseForEachLoop {

    // For Each Loop:
    // for(DataType variableName: ArrayListName){  //Statements  }

    // For Each loop is needed to retrive data from Array List
    //static List<String> nameList=new ArrayList<String>();


    public static void main(String[] args) {

        //String stName="Jonny";

        List<String> nameList=new ArrayList<String>();
        nameList.add("Aroz");
        nameList.add("Fahim");
        nameList.add("Nafis");
        nameList.add("Jahid");
        nameList.add("Bushra");
        nameList.add("Sheema");
        nameList.add("Kollol");
        nameList.add("Abir");
        nameList.add("Rana");
        nameList.add("Mahmud");

        for (String name: nameList) {
            System.out.println(name);

        }





    }


}
