import java.util.Arrays;

public class ArrayPrep {

    public static void main(String[] args) {
        // Declaration and initialization
        int[] intArray = new int[5];
        // Declaration and initialization with values
        String[] strArray = {"Java", "Python", "C++"};

        // Setting values
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;
        intArray[3] = 40;
        intArray[4] = 50;

        // Printing arrays
        System.out.println("Integer Array: ");
        for (int i : intArray) {
            System.out.println(i);
        }

        System.out.println("String Array: ");
        for (String s : strArray) {
            System.out.println(s);
        }

        System.out.println("Array Length: " + intArray.length);

        // Creating a stream from an array
        long count = Arrays.stream(strArray).count();
        System.out.println("Number of elements in the string array: " + count);

        int[] myArray = {6, 42, 3, 7};
        // Sum of array elements using Arrays.stream().sum()
        int sum = Arrays.stream(myArray).sum();
        System.out.println("The sum of the numbers in the array is: " + sum);

        // Sorting the array
        Arrays.sort(myArray);
        System.out.println("Sorted array: " + Arrays.toString(myArray));

        // Binary search for an element in the sorted array
        int index = Arrays.binarySearch(myArray, 7);
        System.out.println("Index of element 7 in the sorted array: " + index);

        // Filling the array with a specific value
        Arrays.fill(myArray, 1);
        System.out.println("Array after filling with 1: " + Arrays.toString(myArray));

        // Creating a new array and copying elements from the original array
        int[] newArray = Arrays.copyOf(myArray, myArray.length);
        System.out.println("New copied array: " + Arrays.toString(newArray));

        // Creating a new array and copying a range of elements from the original array
        int[] rangeArray = Arrays.copyOfRange(newArray, 1, 3);
        System.out.println("Range copied array: " + Arrays.toString(rangeArray));

        // Checking if two arrays are equal
        boolean isEqual = Arrays.equals(myArray, newArray);
        System.out.println("Are the original and new arrays equal? " + isEqual);

        // 2D array
        int[][] twoDArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Printing 2D array
        System.out.println("2D Array: ");
        for (int[] integerArray : twoDArray) {
            for (int anInt : integerArray) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        int[] sortIntArray = {5, 3, 1, 4, 2};

        // Sorting array
        Arrays.sort(sortIntArray);

        // Printing sorted array
        System.out.println("Sorted Array: ");
        for (int i : sortIntArray) {
            System.out.println(i);
        }
    }
}
