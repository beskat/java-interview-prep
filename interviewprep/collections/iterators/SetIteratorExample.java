package collections.iterators;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIteratorExample {
    public static void main(String[] args) {
        // Creating a set
        Set<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Obtaining an iterator for the set
        Iterator<String> iterator = colors.iterator();

        // Iterating over the set using the iterator
        System.out.println("Colors:");
        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println(color);
        }

        // Removing an element while iterating
        iterator = colors.iterator(); // Resetting the iterator
        while (iterator.hasNext()) {
            String color = iterator.next();
            if ("Green".equals(color)) {
                iterator.remove();
            }
        }

        // Displaying the set after removal
        System.out.println("Colors after removal:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
