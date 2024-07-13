import java.sql.SQLOutput;

public class StringPrep {

    public static void main(String[] args) {
        String str = "Java Programming";

        // Length of the string
        int length = str.length();
        // Character at a specific index
        char charAt = str.charAt(5);
        // Substring from index 5 to 10
        String substring = str.substring(5, 10);
        // Converting to uppercase
        String upperCase = str.toUpperCase();
        // Replacing characters
        String replacedString = str.replace("a", "x");

        System.out.println("Original String: " + str);
        System.out.println("Length: " + length);
        System.out.println("Character at index 5: " + charAt);
        System.out.println("Substring (5 to 10): " + substring);
        System.out.println("Uppercase: " + upperCase);
        System.out.println("Replaced 'a' with 'x': " + replacedString);

        System.out.println("***********************************************************");

        StringBuilder sb = new StringBuilder("Hello");

        // Append string
        sb.append(" World");
        // Insert string at index
        sb.insert(6, "Java ");
        // Replace substring
        sb.replace(6, 10, "Amazing");
        // Delete substring
        sb.delete(6, 13);
        // Reverse string
        sb.reverse();

        System.out.println("StringBuilder: " + sb);
    }
}
