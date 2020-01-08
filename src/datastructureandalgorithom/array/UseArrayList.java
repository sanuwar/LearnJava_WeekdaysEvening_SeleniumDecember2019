package datastructureandalgorithom.array;

import java.util.ArrayList;

public class UseArrayList {

    public static void main(String[] args) {

    // ArrayList
        ArrayList<String> studentNameList=new ArrayList<String>();
        studentNameList.add("fahim");
        studentNameList.add("Kollol");
        studentNameList.add("Tarik");
        studentNameList.add("Jonny");
        studentNameList.add("Abir");

        studentNameList.remove(2);

        System.out.println(studentNameList.get(3));
        System.out.println(studentNameList.size());

        //Retrive all the the value from ArrayList we use for each loop
        for (String st: studentNameList) {
            System.out.println(st);
        }

        for (String st: studentNameList) {
            System.out.println(st);
        }
        System.out.println("********************************");
        for(int i=0; i<=studentNameList.size()-2; i++){
            System.out.println(studentNameList.get(i));
        }

        System.out.println("********************************");
        for(int i=1; i<studentNameList.size(); i++){
            System.out.println(studentNameList.get(i));
        }



    }


}
