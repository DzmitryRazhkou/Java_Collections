package _practise;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayList {
    public static void main(String[] args) {

        List<String> arr1 = new java.util.ArrayList<>();
        arr1.add("Gibson SG");
        arr1.add("Gibson Les Paul");
        arr1.add("Gibson ES");
        arr1.add("Gibson SG Standard");
        arr1.add("Gibson Les Paul Standard");
        arr1.add("Gibson SG Faded");

        List<String> arr2 = new java.util.ArrayList<>();
        arr2.add("Fender Precision Bass");
        arr2.add("Fender Jazz Bass");
        arr2.add("Fender Jaguar Bass");

        arr1.addAll(6, arr2);
        System.out.println(arr1);


        java.util.ArrayList<String> cloneList = (java.util.ArrayList<String>) ((java.util.ArrayList<String>) arr1).clone();
        System.out.println("\n s: " +cloneList);

        List<Integer> num = new java.util.ArrayList<>(Arrays.asList(1,4, 89, 7 , 4, 8 ,9, 12, 65, 15, 5, 99, 0, 8));
        num.removeIf(n->n%2 == 0);
        System.out.println(num);

        List<String> list = new java.util.ArrayList<String>(Arrays.asList("Java", "C#", "C++", "Php", "Swift", "Python", "Ruby"));
        list.retainAll(Collections.singleton("Php"));
        System.out.println(list);

        List<String> list2 = new java.util.ArrayList<String>(Arrays.asList("Java", "C#", "C++", "Php", "Swift", "Python", "Ruby"));
        Object[]ar = list2.toArray();
        System.out.println("\nHey:" +Arrays.toString(ar));

        for (String b: list2){
            System.out.println(b);
        }

        List<String> ev = new java.util.ArrayList<>(Arrays.asList("Tesla 3", "Tesla Y", "Mustang E-Mach", "Jeep Wrangler 4xe", "Chevy Volt"));

        for (int i = 0; i < ev.size(); i++) {
            System.out.println("For loop: " +ev.get(i));
        }

        for (String e: ev) {
            System.out.println(e);
        }
        System.out.println("-----------");

        ev.stream().forEach(p-> System.out.println(p));

        Iterator<String> it = ev.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        List<Integer> numbers = new java.util.ArrayList<>(Arrays.asList(1,2,4,5,7,4,2,8,9,6,3,15,1,5,8,4,6,0,8,10));
        LinkedHashSet<Integer> linked = new LinkedHashSet<>(numbers);
        List<Integer> numbersWithout = new java.util.ArrayList<>(linked);
        System.out.println("\nHere: " +numbersWithout);

        System.out.println("---------------");

        Set<Integer> nu = new HashSet<>(numbers);
        List<Integer> list_P = new java.util.ArrayList<>(nu);
        System.out.println(list_P);

        CopyOnWriteArrayList<String> il = new CopyOnWriteArrayList<String>(Arrays.asList("Tesla 3", "Tesla Y", "Mustang E-Mach", "Jeep Wrangler 4xe"));
        il.add(0, "Chevy Silverado EV");
        System.out.println(il);

        synchronized (ev) {
            Iterator<String>its = ev.iterator();
            its.hasNext();
            System.out.println(its.next());
        }


    }
}