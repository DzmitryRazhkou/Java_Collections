import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import static javax.swing.UIManager.get;

public class App {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("Epiphone", "Les Paul");
        map1.put("Gibson", "SG");
        map1.put("Fender", "Jazz Bass");

        Map<String, String> sync = Collections.synchronizedMap(map1);

        Iterator<String> it = sync.keySet().iterator();
        while (it.hasNext()){
            String key = it.next();
            String value = sync.get(key);
            System.out.println(key+" : " +value);
        }

        System.out.println("__________");

        Map<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("Philadelphia", "PHL");
        concurrentHashMap.put("Los Angeles", "LAX");
        concurrentHashMap.put("Chicago", "ORD");
        concurrentHashMap.put("Miami", "MIA");

        for (Map.Entry<String, String> s: concurrentHashMap.entrySet()){
            System.out.println(s.getKey()+ " : " + s.getValue());
        }

        System.out.println("----------------");

        Iterator<Map.Entry<String, String>> irs = concurrentHashMap.entrySet().iterator();
        while (irs.hasNext()) {
            Map.Entry y = irs.next();
            System.out.println(y.getKey()+" / " +y.getValue());
        }

        System.out.println("Hey____________");

        List<String> conList = new CopyOnWriteArrayList<>(Arrays.asList("\"Tesla 3\", \"Tesla Y\", \"Mustang E-Mach\", \"Jeep Wrangler 4xe\", \"Chevy Volt\""));
        for (int i = 0; i < conList.size(); i++) {
            System.out.println(conList.get(i));
        }
    }
}
