package Queue_ExtendsCollections.PriorityQueue_ImplementsQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

class MyComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.length() - o1.length();
    }
}

public class PriorityQueueWithStringLength {

    public static void main(String[] args) {
        MyComparator comp = new MyComparator();
        PriorityQueue<String> pre = new PriorityQueue<String>(10, comp);
        pre.add("Dzmitry Razhkou");
        pre.add("Dzmitry");
        pre.add("Dmit");
        System.out.println("head: " +pre.element());
        System.out.println("tail: " +pre.peek());

        System.out.println("The Highest: " +pre.poll());

    }
}
