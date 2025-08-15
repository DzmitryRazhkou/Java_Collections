package List_ExtendsCollections.ArrayList_ImplementsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("Java");
        arr1.add("JavaScript");
        arr1.add("Swift");
        arr1.add("C#");
        arr1.add("C++");
        arr1.add("Python");

        ArrayList<String> arr2 = new ArrayList<>();
        arr1.add("Testing");
        arr1.add("Development");
        arr1.add("Dev Ops");

//        AddAll (Arr1 int Arr2)

//        arr1.addAll(arr2);
//        System.out.println(arr1);

//        AddAll (Arr1 int Arr2)

        arr1.addAll(0, arr2);
        System.out.println(arr1);

//        Clone

        ArrayList<String> cloneList = (ArrayList<String>) arr1.clone();
        System.out.println("\nClone: " +cloneList);

        System.out.println(arr1.contains("Java"));
        System.out.println(arr1.lastIndexOf("Dev Ops"));
        System.out.println(arr1.indexOf("Rus")>2);

        arr1.remove("Dev Ops");
        System.out.println(arr1);

//        Important Interview Question

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        numbers.removeIf(num -> num%2 != 0);
        System.out.println(numbers);

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList("Gans", "Tom", "Peter", "Peter", "John"));
        namesList.retainAll(Collections.singleton("Peter"));
        System.out.println(namesList);

        ArrayList<String> newList = new ArrayList<>(Arrays.asList("Gans", "Tom", "Peter", "Dan", "John"));
        Object arr[] = newList.toArray();
        System.out.println(Arrays.toString(arr));

        for (Object o: arr) {
            System.out.println(o);
        }

    }
}
