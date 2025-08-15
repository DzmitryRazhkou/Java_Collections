package Map_ExtendsCollections.HashMap_ImplementsMap;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaysCreatingHashMap {

    public static Map<String, Integer> markMap;

    static {
        markMap = new HashMap<>();
        markMap.put("A", 100);
        markMap.put("B", 200);
    }

    public static void main(String[] args) {

//      1. Using HashMap Class:

        HashMap<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();

//      2. Static Way:
        WaysCreatingHashMap.markMap.get("A");

//      3. ImmutableMap with only single entry:

        Map<String, Integer> map3 = Collections.singletonMap("Test", 100);
        System.out.println(map3);
//        map3.put("A", 500); UnsupportedOperationException

//        4. Creating one 2D Array of strings and using Stream:
        Map<String, String> map4 = Stream.of(new String[][]{
                {"Tom", "A Grade"},
                {"Jason", "A+ Grade"},

                }).collect(Collectors.toMap(data->data[0], data ->data[1]));
        System.out.println(map4.get("Tom"));

//        5. Using SimplyEntry:
        Map<String, String> map5 = Stream.of(
                new AbstractMap.SimpleEntry<>("Gans", "Java"),
                new AbstractMap.SimpleEntry<>("Edward", "JS")
        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(map5.get("Gans"));
        map5.put("John", "Python");

//        6. Entry Map:
        Map<String, String> emptyMap = Map.of();
        emptyMap.put("Brandon", "C##");
        emptyMap.put("Evan", "Ruby");
//        System.out.println("Evan"); UnsupportedOperationException.

//        7. Singleton Map:

        Map<String, String> singletonMap = Map.of("k1", "v1");
        System.out.println(singletonMap.get("k1"));
        singletonMap.put("k2", "v2");
//        System.out.println(singletonMap.get("k2")); UnsupportedOperationException.

//        8. Multi Values Map (Max 10 pairs):
        Map<String, String> multiMap = Map.of("k1", "v1", "k2", "v2", "k3", "v3");

//        9. ofEntries Method (No limitation pair key-value);

        Map<String, Integer> map10 = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("Java", 100),
                new AbstractMap.SimpleEntry<>("C##", 200)
        );





    }
}
