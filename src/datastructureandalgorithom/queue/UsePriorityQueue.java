package datastructureandalgorithom.queue;

import java.util.PriorityQueue;

public class UsePriorityQueue {


    public static void main(String[] args) {

        PriorityQueue<Integer> pQueue=new PriorityQueue<Integer>();
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);

        // top element from priority Queue
        System.out.println(pQueue.peek());
        // pick and remove
        System.out.println(pQueue.poll());
        System.out.println(pQueue.peek());

    }
}
