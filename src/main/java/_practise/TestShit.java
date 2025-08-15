package _practise;

import java.util.*;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestShit {
    public static void main(String[] args) {
        List<Object> s = new ArrayList<>(Arrays.asList(12, 50, 12, 75, 30, 75, 12, 90, 30));
        removeAll(s);

        List<String> list = new ArrayList<>(Arrays.asList("Tesla 3", "Tesla Y", "Mustang E-Mach", "Jeep Wrangler 4xe", "Tesla Y", "TSL Cybertruck"));
        synchronized (list){
            Iterator<String> it = list.iterator();
            while (it.hasNext()){
                it.next();
                System.out.println(it.next());
            }
        }
    }

    public static void removeAll(List<Object> arr) {
        LinkedHashSet<Object> linked = new LinkedHashSet<>(arr);
        List<Object> list = new ArrayList<>(Arrays.asList(linked));
        for (Object s : list) {
            System.out.println(s);
        }
    }
}
