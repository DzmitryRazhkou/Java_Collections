package List_ExtendsCollections.ArrayList_ImplementsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsArrayListUsingLinkedHashSet {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 6, 7, 8, 1, 2, 4, 1, 1, 5, 3, 2, 8, 5));

//        1. LinkedList

        LinkedHashSet<Integer> linkedList = new LinkedHashSet<>(numbers);
        ArrayList<Integer> numberWithoutDuplication = new ArrayList<>(linkedList);
        System.out.println( "\nLinkedHashSet: " + numberWithoutDuplication);



        //    2. JDK - Stream

        List<Integer> marksListUnique = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("\nStream: "+marksListUnique);

    }





}
