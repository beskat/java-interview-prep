package oop.encapsulation;

public class EncapsulationExample {
    public static void main(String[] args) {
        /*
         * Encapsulation is the mechanism of wrapping the data (variables) and the code (methods) together as a single unit.
         * In oop.encapsulation, the variables of a class are hidden from other classes and can be accessed only through the methods of their current class.
         */
        Person person = new Person();
        person.setName("John");
        person.setAge(25);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
