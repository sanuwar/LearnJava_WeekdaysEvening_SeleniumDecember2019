package datastructureandalgorithom.stack;


import java.util.Iterator;
import java.util.Stack;

public class UseStack {
    public static void main(String[] args) {
        Stack<String> obj = new Stack();


        int choice = 0;

        for(int i=1; i<5; i++) {
            obj.push("Plate: " + i);
        }



        Iterator it = obj.listIterator();
        while(it.hasNext()) {
            System.out.println(obj.pop());
        }
    }
}
