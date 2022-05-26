package List_ExtendsCollections.ArrayList_ImplementsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayCompare {
    public static void main(String[] args) {

//        1. Sort and then equals:

        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
        ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
        ArrayList<String> list3 = new ArrayList<String>(Arrays.asList("B", "A", "C", "D", "F"));

        Collections.sort(list1);
        Collections.sort(list2);

        System.out.println(list1.equals(list2));
        System.out.println(list1.equals(list3));

//        2. Compare two list - find out the additional elements:

        ArrayList<String> list4 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
        ArrayList<String> list5 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));

//        list4.removeAll(list5);
//        System.out.println(list4);

        list5.retainAll(list4);
        System.out.println(list5);

//        3. Find out the common elements.

        ArrayList<String> length1 = new ArrayList<String>(Arrays.asList("Toyota", "Tesla", "Nissan", "GMC", "Chevy", "Ford", "Kia", "Lexus"));
        ArrayList<String> length2 = new ArrayList<String>(Arrays.asList("Toyota", "Tesla", "Bentley", "Honda", "Chevy", "Ford", "RR", "Lexus"));

        length1.retainAll(length2);
        System.out.println(length1);
    }
}
