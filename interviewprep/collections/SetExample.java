package collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    /*
     * A Set is a collection that does not allow duplicate elements.
     * The elements are not ordered.
     */

    public static void main(String[] args) {
        // Creating a set using HashSet
        Set<String> countries = new HashSet<>();

        // Adding elements to the set
        countries.add("USA");
        countries.add("Canada");
        countries.add("Mexico");
        countries.add("Brazil");

        // Adding a duplicate element, which will be ignored
        countries.add("USA");

        // Iterating over the set using for-each loop
        System.out.println("Set of countries using for-each loop:");
        for (String country : countries) {
            System.out.println(country);
        }

        // Iterating over the set using forEach method (Java 8 and later)
        System.out.println("Set of countries using forEach method:");
        countries.forEach(System.out::println);

        // Checking if an element exists
        System.out.println("Does the set contain 'Canada'? " + countries.contains("Canada"));

        // Removing elements
        countries.remove("Mexico");
        System.out.println("Set after removing 'Mexico': " + countries);

        // Getting the size of the set
        System.out.println("Size of the set: " + countries.size());

        // Converting set to an array
        String[] countryArray = countries.toArray(new String[0]);
        System.out.println("Array of countries:");
        for (String country : countryArray) {
            System.out.println(country);
        }

        // Clearing the set
        countries.clear();
        System.out.println("Set after clearing: " + countries);

        // Checking if the set is empty
        System.out.println("Is the set empty? " + countries.isEmpty());
    }
}

