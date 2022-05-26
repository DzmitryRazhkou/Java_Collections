package Map_ExtendsCollections.HashTable_ImplementsMap;

import java.util.Hashtable;

public class HashTableConcept {
    public static void main(String[] args) {

//        <K, V>
//        HashTable is synchronized.
//        It doesn't allow any null keys and null values
//        Initial capacity of HashTable = 11, load factor = 0,75.
//        Initial capacity of HashMap = 16, load factor = 0,75.

        Hashtable<String, Integer> town = new Hashtable<String, Integer>();
        town.put("Fort Worth", 918915);
        town.put("Houston", 2310000);
        town.put("Pittsburgh", 302971);
        town.put("Honolulu", 350964);
        town.put("Boston", 675647);

        System.out.println(town.get("Houston"));
        System.out.println(town.get("Honolulu"));

    }
}
