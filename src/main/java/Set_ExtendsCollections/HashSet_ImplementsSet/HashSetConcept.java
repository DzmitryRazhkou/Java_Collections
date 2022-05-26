package Set_ExtendsCollections.HashSet_ImplementsSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetConcept {
    public static void main(String[] args) {
        Set<String> sp = new HashSet<>();
        sp.add("Jack Daniels");
        sp.add("JB");
        sp.add("Jameson");
        sp.add("JB");
        sp.add("Havana Club");
        sp.add("JB");

        System.out.println(sp);

        System.out.println(sp.contains("JB"));
        System.out.println("____________");

        for (String s : sp) {
            System.out.println(s);
        }

        Set<Integer> first = new HashSet<>();
        first.addAll(Arrays.asList(new Integer[] {1, 3, 5, 7, 9, 12, 8, 5}));

        Set<Integer> second = new HashSet<>();
        second.addAll(Arrays.asList(new Integer[] {1, 3, 5, 7, 9, 12, 4, 10}));

//        1. Get a union:

        Set<Integer> union = new HashSet<>(first);
        union.addAll(second);
        System.out.println("\nUnion: \n" + union);
        System.out.println("__________");

//        2. Get intersection:

        Set<Integer> intersection = new HashSet<>(first);
        intersection.retainAll(second);
        System.out.println("\nIntersection: \n" + intersection);
        System.out.println("__________");

//        3. Get Difference:

        Set<Integer> diff = new HashSet<>(first);
        diff.removeAll(second);
        System.out.println("\nDifference: \n" + diff);
        System.out.println("__________");

    }
}
