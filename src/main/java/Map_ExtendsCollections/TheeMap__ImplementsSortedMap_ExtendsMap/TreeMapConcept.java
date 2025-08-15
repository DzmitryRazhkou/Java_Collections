package Map_ExtendsCollections.TheeMap__ImplementsSortedMap_ExtendsMap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept {
    public static void main(String[] args) {

//        Stores data in Key-Value format
//        It does maintance on sorting the elements by Keys

        TreeMap<Integer, String> city = new TreeMap<>();
        city.put(3898747, "Los Angeles");
        city.put(2746388, "Chicago");
        city.put(2310000, "Houston");
        city.put(206518, "Worcester");
        city.put(1603797, "Philadelphia");
        city.put(2700000, "Chicago");
        city.put(689545, "Washington DC");
        city.put(8804190, "New York");
        city.put(238005, "Norfolk");
        city.put(918915, "Fort Worth");
        city.put(873965, "San Francisco");
        city.put(675647, "Boston");
        city.put(302971, "Pittsburgh");
        city.put(350964, "Honolulu");

        System.out.println(city);
        System.out.println("____________");

        city.forEach((k, v) -> System.out.println(+ k + " is population of " + v));

        System.out.println(city.firstKey());
        System.out.println(city.lastKey());
        System.out.println("____________");

        Set<Integer> lessThanOneMillion = city.headMap(1000000).keySet();
        System.out.println(lessThanOneMillion);

        Set<Integer> greaterThanOneMillion = city.tailMap(1000000).keySet();
        System.out.println(greaterThanOneMillion);

        TreeMap<String, Integer> town = new TreeMap<>(Comparator.reverseOrder());
        town.put("Fort Worth", 918915);
        town.put("Houston", 2310000);
        town.put("Pittsburgh", 302971);
        town.put("Honolulu", 350964);
        town.put("Boston", 675647);

        town.forEach((x, y)-> System.out.println("City of " + x + ", population is " +y));
    }
}
