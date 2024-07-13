package collections.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIteratorExample {
    public static void main(String[] args) {
        // Creating a list
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Obtaining an iterator for the list
        Iterator<String> iterator = fruits.iterator();

        // Iterating over the list using the iterator
        System.out.println("Fruits:");
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }

        // Removing an element while iterating
        iterator = fruits.iterator(); // Resetting the iterator
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if ("Banana".equals(fruit)) {
                iterator.remove();
            }
        }

        // Displaying the list after removal
        System.out.println("Fruits after removal:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
