package _practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMap {
    public static void main(String[] args) {

        java.util.HashMap<String, String> airportMap = new java.util.HashMap<>();
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

        Iterator<String> it = airportMap.keySet().iterator();
        while (it.hasNext()) {
        it.hasNext();
        String key = it.next();
        String value = airportMap.get(key);
        System.out.println("Keys: " +key+ ", " + "Values: " +value);
        }

        System.out.println("____________________________________");

        airportMap.forEach((k,v)-> System.out.println("City: " +k+ " ---> " +"Airport: " +v));

        System.out.println("------------------------------------");
        Iterator<Map.Entry<String, String>> f = airportMap.entrySet().iterator();
        while(f.hasNext()) {
            Map.Entry entry = f.next();
            System.out.println("City: " +entry.getKey() + " ---> " + "Hub: " +entry.getValue());
        }

        System.out.println("___________________________________");

        for (String k: airportMap.keySet()) {
            System.out.println(k);
        }

        for (String v: airportMap.values()) {
            System.out.println(v);
        }

        System.out.println("___________________________________");

        for (Map.Entry kv: airportMap.entrySet()) {
            System.out.println("City: " +kv.getKey() +" ---> "+ "Hubs: " +kv.getValue());
        }

        List<String> city = new ArrayList<>(airportMap.keySet());
        city.forEach(c-> System.out.println(c));

        List<String> hubs = new ArrayList<>(airportMap.values());
        hubs.forEach(h-> System.out.println(h));

    }
}
