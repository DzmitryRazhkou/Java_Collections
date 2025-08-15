package List_ExtendsCollections.Vector_ImplementsList;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorConcept {
    public static void main(String[] args) {

        Vector<String> lakes = new Vector<>();
        lakes.add("Tahoe");
        lakes.add("Michigan");
        lakes.add("Ontario");
        lakes.add("Great Salt Lake");
        lakes.add("Erie");
        System.out.println("SF: "+lakes.lastIndexOf("Great Salt Lake"));

        Iterator it = lakes.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Vector<String> lakeUsa = new Vector<>();
        lakeUsa.add("Yellowstone Lake");
        lakeUsa.add("Salton Sea");
        lakeUsa.add("Big Bear Lake");

        lakes.addAll(lakeUsa);

        lakes.forEach(t-> System.out.println(t));
        System.out.println("________");

        Collections.sort(lakes);
        System.out.println(lakes);
    }
}
