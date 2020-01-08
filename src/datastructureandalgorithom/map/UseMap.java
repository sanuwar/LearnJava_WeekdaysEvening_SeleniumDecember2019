package datastructureandalgorithom.map;

import java.util.HashMap;
import java.util.Map;

public class UseMap {
    // Map:

    // Map<key, value> name=new HashMap<K,V>();
    // country is a Key and USA is the value
    // country="USA";

    public static void main(String[] args) {

        //Map<String, String> stateMap = new HashMap<String, String>();
        Map<String, String> stateMap = new HashMap<>();
        stateMap.put("USA","NY");
        stateMap.put("CANADA","ON");
        stateMap.put("JAPAN","TK");
        stateMap.put("BANGLADESH","DHK");
        stateMap.put("USA","NJ");

        // Retrive value

        for (Map.Entry<String,String> entry:stateMap.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        System.out.println("************************************************");
        for (String st:stateMap.keySet()) {
            System.out.println(st + " : "+stateMap.get(st));
        }



    }


}
