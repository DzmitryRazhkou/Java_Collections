package Map_ExtendsCollections.HashMap_ImplementsMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapConcept {
    public static void main(String[] args) {

//        By default: 16 node (buckets) consist of:
//        Node(K,V)
//        int hash;
//        K key;
//        V value:
//        Node(K, V) next:


//        public V put(K key, V value){
//        int hash = hashcode(key);
//        int index = hash & (n-1);
//        n = 16 (map size)
//        }

//        No index - no order;
//        Stored values - Key-Value <k, v>
//        Key can not be duplicate
//        can store a number of null values but only one key ----> if we put one more time, it will give us the latest value of null.
//        HashMap isn't Thread safe.

        HashMap<String, String> airportMap = new HashMap<>();
        airportMap.put("Philadelphia", "Philadelphia International Airport - PHL");
        airportMap.put("Los Angeles", "Los Angeles International Airport - LAX");
        airportMap.put("Los Angeles", "Hollywood-Burbank Airport");
        airportMap.put("New York City", "John F. Kennedy International Airport - JKF");
        airportMap.put("Chicago", "O'Hare International Airport - ORD");
        airportMap.put("Dallas", "Dallas/Fort Worth International Airport - DWF");
        airportMap.put("Dallas", "Dallas Love Field International Airport - DLF");
        airportMap.put("Miami", "Miami International Airport - MIA");
        airportMap.put("Boston", "Boston Logan International Airport - BOS");
        airportMap.put("Houston", "George Bush Intercontinental Airport - IAH");
        airportMap.put("Vancouver", "Vancouver International Airport - YVR");
        airportMap.put(null, "Sheremetyevo - A.S. Pushkin international airport - SVO");

        System.out.println(airportMap.get(null));
        System.out.println("__________________");

//        1. Iterator over the keys (Using Iterator):

        Iterator<String> it = airportMap.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            String value = airportMap.get(key);
            System.out.println("Keys = " + key + "; " + " Values = " + value + ". ");
        }
        System.out.println("_______________");

//       2.  Iterator over lambda:

        airportMap.forEach((k, v) -> System.out.println("City: " + k + ", Name: " + v));
        System.out.println("\n!!!!!!!!!!!---------!!!!!!!!!!!!---------\n");


//        3. Iterator by pair:

        Iterator<Map.Entry<String, String>> it1 = airportMap.entrySet().iterator();
        while (it1.hasNext()){
            Map.Entry entry = it1.next();
            System.out.println("City: " + entry.getKey() + ", Name: " + entry.getValue());
        }

//        4. Using by For Loop (by Keys)

        for (String s: airportMap.keySet()) {
            System.out.println("City: " +s);
        }
        System.out.println("_____________");

//        5. Using by For Loop (by Values)


        for (String r: airportMap.values()) {
            System.out.println("Names: " +r);
        }
        System.out.println("--------------");

//        6. Together

        for (Map.Entry xy: airportMap.entrySet()) {
            System.out.println("City: " + xy.getKey()+ ", Names: " +xy.getValue());
        }


        }


    }
