package Set_ExtendsCollections.HashSet_ImplementsSet;

import Set_ExtendsCollections.HashSet_ImplementsSet.Employee;

import java.util.HashMap;
import java.util.Map;

public class StringImmutable {
    public static void main(String[] args) {
        Map<Employee, String> mP = new HashMap<>();
        Employee e1 = new Employee("Jason", 31);  // it will calculate hashcode and index (for instance index = 1)
        mP.put(e1, "Temporary");
        e1.setAge(40);    // it will recalculate and (index = 4)  ---> null
        System.out.println("Employee status is: " + mP.get(e1));

        Map<String, Integer> s = new HashMap<>();
        String t = "Edward";
        s.put(t, 550);
        System.out.println(s.get(t));

        t = "Jack";
        s.put(t, 750);
        System.out.println(s.get(t));  // String immutable;
        System.out.println(s.get("Edward"));  //    Edward inside HashMap
    }
}
