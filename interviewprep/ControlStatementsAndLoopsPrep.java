public class ControlStatementsAndLoopsPrep {

    public static void main(String[] args) {
        /*
         * Example of if-else statement
         * The if-else statement is used to perform different actions based on different conditions.
         * Here, it checks if the number is positive, negative, or zero and prints the appropriate message.
         */
        int number = 10;

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        /*
         * Example of switch statement
         * The switch statement allows for a variable to be tested for equality against a list of values (cases).
         * The break statement is used to terminate the switch block once a matching case is executed.
         * The default case is executed if none of the cases match.
         */
        int dayOfWeek = 3;

        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

        /*
         * Example of for loop
         * The for loop is used to iterate a part of the program multiple times.
         * It consists of three parts: initialization (int i = 0), condition (i < 5), and increment (i++).
         * Here, it prints the value of i from 0 to 4.
         */
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        /*
         * Example of while loop
         * The while loop is used to repeat a block of code as long as a specified condition is true.
         * Here, it prints the value of i from 0 to 4 as long as i is less than 5.
         */
        int i = 0;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }

        /*
         * Example of do-while loop
         * The do-while loop is similar to the while loop, but it guarantees that the loop body is executed at least once.
         * Here, it prints the value of a from 0 to 4, and the condition (a < 5) is checked after the loop body is executed.
         */
        int a = 0;
        do {
            System.out.println("a = " + a);
            a++;
        }
        while (a < 5);

        /*
         * Example of break statement
         * The break statement is used to exit from the nearest enclosing loop or switch statement.
         * Here, it exits the for loop when the value of b is 5.
         */
        for (int b = 0; b < 10; b++) {
            if (b == 5) {
                break; // Exit the loop when b is 5
            }
            System.out.println("b = " + b);
        }

        /*
         * Example of continue statement
         * The continue statement is used to skip the current iteration of the loop and proceed with the next iteration.
         * Here, it skips the loop body for even numbers and only prints the odd numbers.
         */
        for (int c = 0; c < 10; c++) {
            if (c % 2 == 0) {
                continue; // Skip the rest of the loop iteration for even numbers
            }
            System.out.println("c = " + c);
        }

        /*
         * Example of nested loops
         * Nested loops are loops inside another loop.
         * Here, the outer loop iterates from 1 to 3, and for each iteration of the outer loop,
         * the inner loop also iterates from 1 to 3, printing the values of d and j.
         */
        for (int d = 1; d <= 3; d++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("d = " + d + ", j = " + j);
            }
        }
    }
}


