package List_ExtendsCollections.ArrayList_ImplementsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class VirtualCapacity {

//    Physical Capacity ---> ArrayList 0 ()
//    Virtual Capacity ---> ArrayList 10 by default.

    public static void main(String[] args) {
        ArrayList<String> iPhones = new ArrayList<String>(9);
        iPhones.add("IPhone SE 2");
        iPhones.add("IPhone Xr");
        iPhones.add("IPhone 12 Mini");
        iPhones.add("IPhone 6S");
        iPhones.add("IPhone X");
        iPhones.add("IPhone 8");
        iPhones.add("IPhone 11");
        iPhones.add("IPhone 12 Pro");
        iPhones.add("IPhone 5C");

//        Typical for Loop:
        for (int i = 0; i < iPhones.size(); i++) {
            System.out.println(iPhones.get(i) + "");
        }
        System.out.println("-____-___-___-____");

//        For each Loop

        for (String er : iPhones) {
            System.out.println(er);
        }
        System.out.println("_________");

//        Stream with Lambda

        iPhones.stream().forEach(p -> System.out.println(p));
        System.out.println("------");

//    Iterator

        Iterator<String> it = iPhones.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("Final: _______");

        ArrayList<String> ev = new ArrayList<>(Arrays.asList("Tesla 3", "Tesla S", "Tesla Y", "Tesla X", "Cybertruck"));
        System.out.println(ev);
    }
}