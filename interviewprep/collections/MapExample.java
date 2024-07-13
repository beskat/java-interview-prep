package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    /*
     * A Map is a collection that maps keys to values. It cannot contain duplicate keys, and each key can map to at most one value.
     */

    public static void main(String[] args) {
        // Creating a map using HashMap
        Map<String, Integer> ages = new HashMap<>();

        // Adding key-value pairs to the map
        ages.put("Alice", 30);
        ages.put("Bob", 25);
        ages.put("Charlie", 35);

        // Adding a duplicate key, which will update the value
        ages.put("Alice", 32);

        // Accessing values by key
        System.out.println("Alice's age: " + ages.get("Alice"));

        // Iterating over the map using entrySet and for-each loop
        System.out.println("Ages of people using for-each loop:");
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Iterating over the map using forEach method (Java 8 and later)
        System.out.println("Ages of people using forEach method:");
        ages.forEach((key, value) -> System.out.println(key + ": " + value));

        // Checking if a key exists
        System.out.println("Does the map contain 'Bob'? " + ages.containsKey("Bob"));

        // Checking if a value exists
        System.out.println("Does the map contain the age 25? " + ages.containsValue(25));

        // Getting the size of the map
        System.out.println("Size of the map: " + ages.size());

        // Removing key-value pairs
        ages.remove("Charlie");
        System.out.println("Map after removing Charlie: " + ages);

        // Replacing a value
        ages.replace("Bob", 26);
        System.out.println("Map after replacing Bob's age: " + ages);

        // Getting all keys
        System.out.println("Keys in the map: " + ages.keySet());

        // Getting all values
        System.out.println("Values in the map: " + ages.values());

        // Clearing the map
        ages.clear();
        System.out.println("Map after clearing: " + ages);

        // Checking if the map is empty
        System.out.println("Is the map empty? " + ages.isEmpty());
    }
}

