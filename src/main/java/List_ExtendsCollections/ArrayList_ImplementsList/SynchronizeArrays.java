package List_ExtendsCollections.ArrayList_ImplementsList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizeArrays {
    public static void main(String[] args) {

//        How to synchronize ArrayList in Java:

//        By default, ArrayList is non-synchronized.
//        1. Collections.synchronizedList() - method returns synchronized list.
//        2. copyOnWriteArrayList - class - Thread Safe variant of ArrayList.

        List<String> nameList = Collections.synchronizedList(new ArrayList<String>());

        nameList.add("Java");
        nameList.add("JavaScript");
        nameList.add("Swift");
        nameList.add("Python");

//        add, remove - we don't need explicit synchronization.
//        to fetch/ traverse the values from this list - we have to use explicit synchronization.

        synchronized (nameList) {
            Iterator<String> it = nameList.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }

            System.out.println("_________");

        }

//        CopyOnWriteArrayList - Thread Safe.

        CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<>();
        empList.add("Tom Stevenson");
        empList.add("Evan Johnson");
        empList.add("Samantha Ted");
        empList.add("Jason Barker");

        synchronized (empList) {
            Iterator<String> it = empList.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }
}
