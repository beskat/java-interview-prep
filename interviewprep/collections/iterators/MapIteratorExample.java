package collections.iterators;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIteratorExample {
    public static void main(String[] args) {
        // Creating a map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");

        // Obtaining an iterator for the map's entry set
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();

        // Iterating over the map using the iterator
        System.out.println("Map entries:");
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Removing an entry while iterating
        iterator = map.entrySet().iterator(); // Resetting the iterator
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            if (entry.getKey().equals(2)) {
                iterator.remove();
            }
        }

        // Displaying the map after removal
        System.out.println("Map entries after removal:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
