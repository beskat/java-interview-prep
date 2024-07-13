public class MathClassExamples {
    public static void main(String[] args) {
        // Absolute value of a number
        int number = -42;
        int absoluteValue = Math.abs(number);
        System.out.println("Absolute value of " + number + " is: " + absoluteValue);

        // Maximum of two numbers
        int a = 10;
        int b = 20;
        int max = Math.max(a, b);
        System.out.println("Maximum of " + a + " and " + b + " is: " + max);

        // Minimum of two numbers
        int min = Math.min(a, b);
        System.out.println("Minimum of " + a + " and " + b + " is: " + min);

        // Square root of a number
        double sqrtValue = Math.sqrt(25);
        System.out.println("Square root of 25 is: " + sqrtValue);

        // Power of a number (x^y)
        double powerValue = Math.pow(2, 3);
        System.out.println("2 raised to the power of 3 is: " + powerValue);

        // Round a floating point number to the nearest integer
        double roundValue = Math.round(2.5);
        System.out.println("2.5 rounded is: " + roundValue);

        // Round a floating point number to the nearest integer (ceil)
        double ceilValue = Math.ceil(2.1);
        System.out.println("Ceiling of 2.1 is: " + ceilValue);

        // Round a floating point number to the nearest integer (floor)
        double floorValue = Math.floor(2.9);
        System.out.println("Floor of 2.9 is: " + floorValue);

        // Generate a random number between 0.0 (inclusive) and 1.0 (exclusive)
        double randomValue = Math.random();
        System.out.println("Random value between 0.0 and 1.0 is: " + randomValue);

        // Constants
        System.out.println("Value of PI is: " + Math.PI);
        System.out.println("Value of E is: " + Math.E);
    }
}
