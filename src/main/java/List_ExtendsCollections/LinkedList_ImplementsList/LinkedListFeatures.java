package List_ExtendsCollections.LinkedList_ImplementsList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListFeatures {
    public static void main(String[] args) {

//        It's default class in Java
//        It can use as List, Queue, Stack
//        It allows the null entry
//        Dynamic Collection
//        Hence insertion and deletion can be easily implemented
//        It can contain duplicate elements
//        It isn't synchronized (not thread safe);
//        In LL, manipulation is fast because we don't need any shifting
//        LL constructors

//        LinkedList()
//        LinkedList(Collection c);

        LinkedList<String> cities = new LinkedList<>();
        cities.add("London");
        cities.add("Lids");
        cities.add("Chesapeake");
        cities.add("Cleveland");
        cities.add("Toronto");
        System.out.println("Sf: " +cities.getFirst());

        System.out.println(cities);
        System.out.println("________");
        System.out.println(cities.indexOf("Lids"));

        Iterator it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        cities.add(1, "Norfolk");

        System.out.println("---------");

        for (String c : cities) {
            System.out.println(c);
        }
        System.out.println("-_ ______ _-");

        LinkedList<String> villages = new LinkedList<>();
        villages.add("Avalon, Santa Catalina Island");
        villages.add("Ferndale, Humboldt County");
        villages.add("Ojai, Ventura Count");
        villages.addLast("Nevada City, Nevada County");

        cities.addAll(3, villages);
        cities.forEach(x-> System.out.println(x));
        System.out.println("_____________");

//      Reverse (descending iterator)

        Iterator dIt = cities.descendingIterator();
        while (dIt.hasNext()) {
            System.out.println(dIt.next());
        }
        System.out.println("________");

//        Sorted

        Collections.sort(villages);
        System.out.println(villages);



    }
}
