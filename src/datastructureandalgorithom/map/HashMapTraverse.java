package datastructureandalgorithom.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTraverse {

//	Key Points
//
//	For operations like add, remove, containsKey, time complexity is O(log n where n is number of elements present in TreeMap.
//	TreeMap always keeps the elements in a sorted(increasing) order, while the elements in a HashMap have no order.
//	TreeMap also provides some cool methods for first, last, floor and ceiling of keys.
//

    public static void main(String[] args) {
        int num[] = { 110, 134, 15, 110, 13, 15, 110, 100, 121, 23,56 };
        printFreq(num);
    }

    // This Method prints frequencies of all elements
    static void printFreq(int arr[]) {
        // Creates an empty HashMap
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

        // Traverse through the given array
        for (int i = 0; i < arr.length; i++) {
            Integer c = hmap.get(arr[i]);

            // If this is first occurrence of element
            if (hmap.get(arr[i]) == null)
                hmap.put(arr[i], 1);

                // If elements already exists in hash map
            else
                hmap.put(arr[i], ++c);
        }

        // Print result
        for (Map.Entry m : hmap.entrySet())
            System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
    }




}
