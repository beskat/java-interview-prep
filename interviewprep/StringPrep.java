public class StringPrep {

    public static void main(String[] args) {
        String str = "Hello, World!";

        // length() - Returns the length of the string.
        int len = str.length();
        System.out.println("Length: " + len);  // Output: Length: 13

        // charAt(int index) - Returns the character at the specified index.
        char ch = str.charAt(1);
        System.out.println("Character at index 1: " + ch);  // Output: Character at index 1: e

        // substring(int beginIndex) - Returns a new string starting from the specified index.
        String substr1 = str.substring(7);
        System.out.println("Substring from index 7: " + substr1);  // Output: Substring from index 7: World!

        // substring(int beginIndex, int endIndex) - Returns a new string from start index to end index.
        String substr2 = str.substring(0, 5);
        System.out.println("Substring from index 0 to 5: " + substr2);  // Output: Substring from index 0 to 5: Hello

        // indexOf(char ch) - Returns the index of the first occurrence of the specified character.
        int index1 = str.indexOf('o');
        System.out.println("First occurrence of 'o': " + index1);  // Output: First occurrence of 'o': 4

        // lastIndexOf(char ch) - Returns the index of the last occurrence of the specified character.
        int index2 = str.lastIndexOf('o');
        System.out.println("Last occurrence of 'o': " + index2);  // Output: Last occurrence of 'o': 8

        // contains(CharSequence s) - Returns true if the string contains the specified sequence.
        boolean contains = str.contains("World");
        System.out.println("Contains 'World': " + contains);  // Output: Contains 'World': true

        // equals(Object obj) - Compares this string to the specified object.
        boolean isEqual = str.equals("Hello, World!");
        System.out.println("Equals 'Hello, World!': " + isEqual);  // Output: Equals 'Hello, World!': true

        // equalsIgnoreCase(String anotherString) - Compares this string to another string, ignoring case.
        boolean isEqualIgnoreCase = str.equalsIgnoreCase("hello, world!");
        System.out.println("Equals ignore case 'hello, world!': " + isEqualIgnoreCase);  // Output: true

        // toUpperCase() - Converts all characters to uppercase.
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase: " + upperStr);  // Output: Uppercase: HELLO, WORLD!

        // toLowerCase() - Converts all characters to lowercase.
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase: " + lowerStr);  // Output: Lowercase: hello, world!

        // trim() - Removes leading and trailing whitespace.
        String strWithSpaces = "  Hello, World!  ";
        String trimmedStr = strWithSpaces.trim();
        System.out.println("Trimmed: '" + trimmedStr + "'");  // Output: Trimmed: 'Hello, World!'

        // replace(char oldChar, char newChar) - Replaces all occurrences of the old character with the new character.
        String replacedStr = str.replace('o', '0');
        System.out.println("Replaced 'o' with '0': " + replacedStr);  // Output: Replaced 'o' with '0': Hell0, W0rld!

        // split(String regex) - Splits the string around matches of the given regular expression.
        String[] parts = str.split(", ");
        System.out.println("Split by ', ': " + java.util.Arrays.toString(parts));  // Output: [Hello, World!]

        // join(CharSequence delimiter, CharSequence... elements) - Joins elements with the specified delimiter.
        String joinedStr = String.join(", ", "Hello", "World");
        System.out.println("Joined with ', ': " + joinedStr);  // Output: Joined with ', ': Hello, World

        // isEmpty() - Returns true if the string is empty.
        boolean isEmpty = str.isEmpty();
        System.out.println("Is empty: " + isEmpty);  // Output: Is empty: false

        // isBlank() - Returns true if the string is empty or contains only white space.
        boolean isBlank = str.isBlank();
        System.out.println("Is blank: " + isBlank);  // Output: Is blank: false

        // strip() - Returns a string whose value is this string, with all leading and trailing white space removed.
        String strippedStr = str.strip();
        System.out.println("Stripped: '" + strippedStr + "'");  // Output: Stripped: 'Hello, World!'

        // stripLeading() - Returns a string whose value is this string, with all leading white space removed.
        String leadingStrippedStr = str.stripLeading();
        System.out.println("Leading stripped: '" + leadingStrippedStr + "'");  // Output: 'Hello, World!'

        // stripTrailing() - Returns a string whose value is this string, with all trailing white space removed.
        String trailingStrippedStr = str.stripTrailing();
        System.out.println("Trailing stripped: '" + trailingStrippedStr + "'");  // Output: 'Hello, World!'

        // repeat(int count) - Returns a string whose value is the concatenation of this string repeated count times.
        String repeatedStr = str.repeat(2);
        System.out.println("Repeated twice: " + repeatedStr);  // Output: Repeated twice: Hello, World!Hello, World!

        // format(String format, Object... args) - Returns a formatted string using the specified format string and arguments.
        String formattedStr = String.format("Hello, %s!", "World");
        System.out.println("Formatted: " + formattedStr);  // Output: Formatted: Hello, World!

        // valueOf(int i) - Returns the string representation of the int argument.
        String intValueStr = String.valueOf(123);
        System.out.println("Value of int: " + intValueStr);  // Output: Value of int: 123

        // valueOf(char c) - Returns the string representation of the char argument.
        String charValueStr = String.valueOf('a');
        System.out.println("Value of char: " + charValueStr);  // Output: Value of char: a

        // valueOf(Object obj) - Returns the string representation of the Object argument.
        String objValueStr = String.valueOf(new Object());
        System.out.println("Value of Object: " + objValueStr);  // Output: Value of Object: java.lang.Object@<hashcode>

        // intern() - Returns a canonical representation for the string object.
        String internedStr = str.intern();
        System.out.println("Interned: " + internedStr);  // Output: Interned: HelloWorld!

        // matches(String regex) - Tells whether this string matches the given regular expression.
        boolean matches = str.matches("Hello\\nWorld!");
        System.out.println("Matches regex 'Hello\\nWorld!': " + matches);  // Output: true

        // replace(CharSequence target, CharSequence replacement) - Replaces each substring of this string that matches the literal target sequence with the specified literal replacement sequence.
        String replacedStr2 = str.replace("Hello", "Hi");
        System.out.println("Replaced 'Hello' with 'Hi': " + replacedStr2);  // Output:  HiWorld!

        // replaceAll(String regex, String replacement) - Replaces each substring of this string that matches the given regular expression with the given replacement.
        String replacedAllStr = str.replaceAll("World", "Java");
        System.out.println("Replaced all 'World' with 'Java': " + replacedAllStr);  // Output: HelloJava!

        // replaceFirst(String regex, String replacement) - Replaces the first substring of this string that matches the given regular expression with the given replacement.
        String replacedFirstStr = str.replaceFirst("Hello", "Hi");
        System.out.println("Replaced first 'Hello' with 'Hi': " + replacedFirstStr);  // Output:  HiWorld!

        // toCharArray() - Converts this string to a new character array.
        char[] charArray = str.toCharArray();
        System.out.println(
                "Char array: " + java.util.Arrays.toString(charArray));  // Output:  [H, e, l, l, o, W, o, r, l, d, !]

        // compareTo(String anotherString) - Compares two strings lexicographically.
        int compareToResult = str.compareTo("Hello");
        System.out.println("Compare to 'Hello': " + compareToResult);  // Output: Compare to 'Hello': 7

        // compareToIgnoreCase(String str) - Compares two strings lexicographically, ignoring case differences.
        int compareToIgnoreCaseResult = str.compareToIgnoreCase("hello, world!");
        System.out.println("Compare to ignore case 'hello, world!': " +
                                   compareToIgnoreCaseResult);  // Output: Compare to ignore case 'hello, world!': 0

        // concat(String str) - Concatenates the specified string to the end of this string.
        String concatenatedStr = str.concat(" Again!");
        System.out.println("Concatenated: " + concatenatedStr);  // Output: Concatenated: HelloWorld! Again!

        // endsWith(String suffix) - Tests if this string ends with the specified suffix.
        boolean endsWith = str.endsWith("World!");
        System.out.println("Ends with 'World!': " + endsWith);  // Output: Ends with 'World!': true

        // startsWith(String prefix) - Tests if this string starts with the specified prefix.
        boolean startsWith = str.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWith);  // Output: Starts with 'Hello': true

        // startsWith(String prefix, int toffset) - Tests if the substring of this string starting at the specified index starts with the specified prefix.
        boolean startsWithOffset = str.startsWith("World", 5);
        System.out.println("Starts with 'World' at index 5: " + startsWithOffset);  // Output: false

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
