package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListExample {
    /*
     * A List is an ordered collection (also known as a sequence). Lists can contain duplicate elements.
     * They allow positional access and insertion of elements.
     */

    public static void main(String[] args) {
        // Creating a list using ArrayList
        List<String> fruits = new ArrayList<>();

        // Adding elements to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Adding an element at a specific position
        fruits.add(1, "Blueberry");

        // Accessing elements by index
        System.out.println("First fruit: " + fruits.get(0));

        // Iterating over the list using for-each loop
        System.out.println("List of fruits using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Iterating over the list using forEach method (Java 8 and later)
        System.out.println("List of fruits using forEach method:");
        fruits.forEach(System.out::println);

        // Checking if the list contains an element
        System.out.println("Does the list contain 'Banana'? " + fruits.contains("Banana"));

        // Getting the index of an element
        System.out.println("Index of 'Cherry': " + fruits.indexOf("Cherry"));

        // Removing elements
        fruits.remove("Date");
        System.out.println("List after removing 'Date': " + fruits);

        // Removing element at a specific position
        fruits.remove(2);
        System.out.println("List after removing element at index 2: " + fruits);

        // Modifying elements
        fruits.set(1, "Blackberry");
        System.out.println("Modified list: " + fruits);

        // Sorting the list
        Collections.sort(fruits);
        System.out.println("Sorted list: " + fruits);

        // Sorting the list in reverse order
        fruits.sort(Collections.reverseOrder());
        System.out.println("Reverse sorted list: " + fruits);

        // Sorting the list using a custom comparator
        fruits.sort(Comparator.comparingInt(String::length));
        System.out.println("List sorted by length: " + fruits);

        // Clearing the list
        fruits.clear();
        System.out.println("List after clearing: " + fruits);

        // Checking if the list is empty
        System.out.println("Is the list empty? " + fruits.isEmpty());
    }
}

