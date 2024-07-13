package enums;

public class EnumExample {
    /*
     * An Enum is a special type used to define collections of constants.
     */
    public static void main(String[] args) {
        // Accessing enum values
        Day day = Day.MONDAY;
        System.out.println("Day: " + day);

        // Using enum in switch case
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are busy.");
                break;
            case FRIDAY:
                System.out.println("Fridays are relaxing.");
                break;
            default:
                System.out.println("It's just another day.");
                break;
        }

        // Iterating over enum values
        System.out.println("All days of the week:");
        for (Day d : Day.values()) {
            System.out.println(d);
        }

        // Using valueOf method to convert string to enum
        String dayName = "SUNDAY";
        Day dayFromString = Day.valueOf(dayName);
        System.out.println("Day from string: " + dayFromString);

        // Using enum with methods
        System.out.println("Color code for RED: " + Color.RED.getCode());

        // Using enum with overridden toString method
        System.out.println("Custom toString for Color.GREEN: " + Color.GREEN);
    }
}
