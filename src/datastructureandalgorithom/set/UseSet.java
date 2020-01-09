package datastructureandalgorithom.set;

import java.util.HashSet;
import java.util.Set;

public class UseSet {

    public static void main(String[] args) {

        // Create a hashset of student's last names from this batch

        Set<String> lastNameSet = new HashSet<>();

        // add all the different unique names into last name set
        lastNameSet.add("abir");
        lastNameSet.add("aroz");
        lastNameSet.add("bushra");
        lastNameSet.add("Rahman");
        lastNameSet.add("Ahmed");
        lastNameSet.add("Seema");


        System.out.println(lastNameSet);

    }
}