package datastructureandalgorithom.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseLinkedList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();



        String state2 = "NJ";
        list.add("NY");
        list.add(state2);
        list.add("FL");


        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // Remove node
        list.remove(state2);
        System.out.println("After removing one node");
        // After remove Node
        Iterator it2 = list.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }

        //******************************************
        List<String>nameList=new LinkedList<>();
        nameList.add("Fahim");
        nameList.add("Aroz");
        nameList.add("Abir");
        nameList.add("Jonny");

        Iterator nameIterator=nameList.iterator();
        while (nameIterator.hasNext()) {
            System.out.println(nameIterator.next());
        }

        nameList.remove("Abir");
        Iterator nameIterator1=nameList.iterator();
        while (nameIterator1.hasNext()) {
            System.out.println(nameIterator1.next());
        }

    }
}
