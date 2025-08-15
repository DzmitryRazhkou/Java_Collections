package Map_ExtendsCollections.HashMap_ImplementsMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CompareTwoHasMap {
    public static void main(String[] args) {

        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");


        HashMap<Integer, String> map2 = new HashMap<Integer, String>();
        map2.put(3, "C");
        map2.put(1, "A");
        map2.put(2, "B");

        HashMap<Integer, String> map3 = new HashMap<Integer, String>();
        map3.put(3, "C");
        map3.put(1, "A");
        map3.put(2, "B");
        map3.put(3, "D");

//        1. On the basis of key-value: use equals method.

        System.out.println(map1.equals(map2));
        System.out.println(map1.equals(map3));

//        2. Compare HashMaps for the same keys: keySet():
        System.out.println(map1.keySet().equals(map2.keySet()));
        System.out.println(map1.keySet().equals(map3.keySet()));


//        Find out the Extra Keys (interview Question).

        HashMap<Integer, String> map4 = new HashMap<Integer, String>();
        map3.put(1, "A");
        map3.put(2, "B");
        map3.put(3, "C");
        map3.put(4, "D");

        HashSet<Integer> combineKeys = new HashSet<>(map1.keySet());
//        Add keySet from map4
        combineKeys.addAll(map4.keySet());
        combineKeys.removeAll(map1.keySet());
        System.out.println(combineKeys);

//        Compare Maps By Values:

        HashMap<Integer, String> map5 = new HashMap<Integer, String>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");


        HashMap<Integer, String> map6 = new HashMap<Integer, String>();
        map2.put(1, "A");
        map2.put(2, "B");
        map2.put(3, "C");

//        Duplicates are  allowed (ArrayList)
        System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));

//        Duplicates are not allowed (HashSet)
        System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values())));


    }
}