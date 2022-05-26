package Map_ExtendsCollections.HashMap_ImplementsMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapSynchronizedMap {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("Gibson", "Les Paul");
        map1.put("Gibson", "SG");
        map1.put("Fender", "Jazz Bass");

//      1. Synchronized Map:

        Map<String, String> syncMap = Collections.synchronizedMap(map1);
        System.out.println(syncMap);

//      2. ConcurrentHashMap:

        Map<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("Philadelphia", "PHL");
        concurrentHashMap.put("Los Angeles", "LAX");
        concurrentHashMap.put("Chicago", "ORD");
        concurrentHashMap.put("Miami", "MIA");
        System.out.println(concurrentHashMap.get("Miami"));

    }
}
