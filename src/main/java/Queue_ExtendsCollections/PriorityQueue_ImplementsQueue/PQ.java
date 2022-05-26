package Queue_ExtendsCollections.PriorityQueue_ImplementsQueue;

import java.util.PriorityQueue;

public class PQ {
    public static void main(String[] args) {

        PriorityQueue<Integer> pr = new PriorityQueue<>();
        pr.add(750);
        pr.add(900);
        pr.add(500);
        pr.add(100);

        System.out.println("Size is: " +pr.size());
        System.out.println("Least: " +pr.poll());
    }
}
