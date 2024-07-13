import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        // Example of unchecked exception (ArithmeticException)
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }

        // Example of checked exception (FileNotFoundException)
        try {
            FileInputStream file = new FileInputStream("nonexistentfile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Caught a FileNotFoundException: " + e.getMessage());
        }

        // Example of multiple catch blocks
        try {
            int[] arr = new int[5];
            arr[10] = 3; // This will cause ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught a generic exception: " + e.getMessage());
        }

        // Example of finally block
        try {
            int result = 10 / 2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }

        // Example of Nested Try-Catch
        try {
            int[] array = {1, 2, 3};
            try {
                int result = array[2] / 0;
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException caught: " + e.getMessage());
            }
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
}
