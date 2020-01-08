package datastructureandalgorithom.queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class UseQueue {
    public static void main(String[] args) {
        // Queue
        //FIFO: First in first out
        Queue<String> queue = new LinkedList<>();


        List<String> nameList=new LinkedList<>();


        queue.add("Aroz");
        queue.add("Rifath");
        queue.add("Farzana");
        queue.add("Abir");

        for (String st:queue) {
            System.out.println(st);
        }
        //queue.remove("Rifath");
        System.out.println(queue.element());
        System.out.println(queue.remove());

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue.remove());



    }
}
