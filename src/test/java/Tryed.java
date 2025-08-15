import java.util.*;

public class Tryed {
    public static void main(String[] args) {

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

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 12, 75, 90, 12, 5, 75, 90, 1, 5, 15, 5));
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(list);
        List<Integer> listLinked = new ArrayList<>(linkedHashSet);

        Map<String, String> airports = new HashMap<>();
        airports.put("Philadelphia", "Philadelphia International Airport - PHL");
        airports.put("Los Angeles", "Los Angeles International Airport - LAX");
        airports.put("New York City", "John F. Kennedy International Airport - JKF");
        airports.put("Chicago", "O'Hare International Airport - ORD");
        airports.put("Dallas", "Dallas/Fort Worth International Airport - DWF");
        airports.put("Miami", "Miami International Airport - MIA");
        airports.put("Boston", "Boston Logan International Airport - BOS");
        airports.put("Houston", "George Bush Intercontinental Airport - IAH");

        Iterator<String> it = airports.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            String value = airports.get(key);
            System.out.println(key + " -> " + value);
        }

//        Iterator<Map.Entry<String, String>> f = airportMap.entrySet().iterator();
//        while (f.hasNext()) {
//            Map.Entry s = f.next();
//            System.out.println(s.getKey() + " -> " + s.getValue());
//        }

    }
}
