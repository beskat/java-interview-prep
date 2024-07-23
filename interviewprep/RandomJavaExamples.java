import java.util.HashMap;
import java.util.Map;

public class RandomJavaExamples {

    public static void main(String[] args) {
        // Call each method to demonstrate their functionality
        swapStrings();
        frequencyCounter();
        compressStringExample();
        formAndReplaceSentence();
        isStringPalindrome("abcdcba");
        isStringPalindrome(String.valueOf(156510));
    }

    /*
     * Question: Write a java program that swaps strings without using a third variable.
     * This method swaps two strings without using a third variable by concatenating the strings and then extracting
     * the original strings from the concatenated result.
     */
    public static void swapStrings() {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Before Swap:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // Swap without using a third variable
        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("After Swap:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
    }

    /* Question: Write a program to get the frequency of each integer value in an integer array.
     * This method calculates the frequency of each integer in an integer array using a HashMap to store and count the occurrences.
     */
    public static void frequencyCounter() {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};

        // Create a HashMap to store the frequency of each integer
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Iterate through the array and count the frequency of each integer
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Print the frequency of each integer
        System.out.println("Frequency of each integer:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    /*
     * Question: Write a method to get a string and return it in a compressed format, e.g., "aaaabbcccdda" -> "a4b2c3d2a1".
     * This method compresses a string by counting consecutive occurrences of each character and returning a new
     * string where each character is followed by its count.
     */
    public static void compressStringExample() {
        String input = "aaaabbcccdda";
        String output = compressString(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }

    public static String compressString(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        // Append the last character and its count
        compressed.append(str.charAt(str.length() - 1)).append(count);

        return compressed.toString();
    }

    // Question: Write a method that checks if a given string is a palindrome or not.
    // This method checks if a given string is a palindrome by comparing the original string with its reversed version.
    public static void isStringPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println("The string is empty or null, which cannot be a palindrome.");
            return;
        }
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                System.out.println("'" + str + "' is not a palindrome.");
                return;
            }
            left++;
            right--;
        }
        System.out.println("'" + str + "' is a palindrome.");
    }

    // Form a sentence from an array of words and replaces a target word with a replacement word.
    public static void formAndReplaceSentence() {
        String[] words = {"I", "like", "JAVA"};

        // Form a sentence by concatenating the array elements
        StringBuilder sentence = new StringBuilder();
        for (String word : words) {
            sentence.append(word).append(" ");
        }

        // Convert the StringBuilder to a String and replace the target word with the replacement word
        String finalSentence = sentence.toString().trim().replace("like", "love") + ".";

        System.out.println(finalSentence);
    }
}
