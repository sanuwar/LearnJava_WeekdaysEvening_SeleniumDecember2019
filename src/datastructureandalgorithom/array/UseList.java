package datastructureandalgorithom.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UseList {

    public static void main(String[] args) {
        // ArrayList vs LinkedList
        List<String> nameList=new ArrayList<>();

        List<String> newNameList=new LinkedList<>();

        nameList.add("Fahim");
        nameList.add("Kollol");
        nameList.add("Abir");
        nameList.add("Sanwar");

        System.out.println(nameList.get(2));

        for (String st:nameList) {
            System.out.println(st);
        }

        newNameList.add("Aroz");
        newNameList.add("Zahirul");
        newNameList.add("Bushra");
        for (String st:newNameList) {
            System.out.println(st);
        }

    }


}
