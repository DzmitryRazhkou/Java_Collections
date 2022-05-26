package Map_ExtendsCollections.HashMap_ImplementsMap;

import java.util.*;

public class ConvertHashMapToArrayList {
    public static void main(String[] args) {
        Map<String, Integer> population = new HashMap<>();
        population.put("Philadelphia", 1650000);
        population.put("Miami", 4476000);
        population.put("Toronto", 6800000);
        population.put("Los Angeles", 3900000);

        System.out.println("Population Map size is " + population.size());
        System.out.println("-----------");

        Iterator it = population.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }

//        Convert HashMap keys to ArrayList:

        List<String> city = new ArrayList<>(population.keySet());
        System.out.println(city);
        for (String c : city) {
            System.out.println(c);
        }

//        Convert HashMap values to ArrayList:

        List<Integer> numbers = new ArrayList<>(population.values());
        System.out.println(numbers);
        for (Integer n : numbers) {
            System.out.println(n);
        }
    }
}
