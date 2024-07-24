import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    /*
     * Regular expressions (regex) in Java are patterns used to match character sequences in strings.
     * Java provides the java.util.regex package for pattern matching with regular expressions.
     * This package includes the Pattern and Matcher classes.
     */

    public static void main(String[] args) {
        // Example 1: Simple Pattern Matching
        String text1 = "Hello, world!";
        String patternString1 = "Hello";
        Pattern pattern1 = Pattern.compile(patternString1);
        Matcher matcher1 = pattern1.matcher(text1);
        if (matcher1.find()) {
            System.out.println("Example 1: Found a match!");
        } else {
            System.out.println("Example 1: No match found.");
        }

        // Example 2: Pattern with Metacharacters
        String text2 = "The price is $100.00";
        String patternString2 = "\\$\\d+\\.\\d{2}";
        Pattern pattern2 = Pattern.compile(patternString2);
        Matcher matcher2 = pattern2.matcher(text2);
        if (matcher2.find()) {
            System.out.println("Example 2: Found a price: " + matcher2.group());
        } else {
            System.out.println("Example 2: No price found.");
        }

        // Example 3: Splitting Strings
        String text3 = "one, two, three";
        String patternString3 = ",\\s*";
        Pattern pattern3 = Pattern.compile(patternString3);
        String[] words = pattern3.split(text3);
        System.out.println("Example 3: Split words:");
        for (String word : words) {
            System.out.println(word);
        }

        // Example 4: Replacing Text
        String text4 = "Hello 123, this is a test 456.";
        String patternString4 = "\\d+";
        Pattern pattern4 = Pattern.compile(patternString4);
        Matcher matcher4 = pattern4.matcher(text4);
        String result4 = matcher4.replaceAll("NUMBER");
        System.out.println("Example 4: " + result4);

        // Example 5: Validating Email Addresses
        String email = "example@example.com";
        String patternString5 = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern pattern5 = Pattern.compile(patternString5);
        Matcher matcher5 = pattern5.matcher(email);
        if (matcher5.matches()) {
            System.out.println("Example 5: Valid email address.");
        } else {
            System.out.println("Example 5: Invalid email address.");
        }
    }
}
