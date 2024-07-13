package oop.abstraction;

public class AbstractionExample {
    public static void main(String[] args) {
        /*
         * Abstraction is the process of hiding the implementation details and showing only the functionality to the user.
         * It can be achieved with either abstract classes or interfaces in Java.
         * The difference between an abstract and interface is that abstract has at least one method that is marked
         * as abstract so does not have to be fully abstract, but all the methods of the interface are abstract.
         * You can't create objects ob an abstract class or interface.
         * Interfaces can extend other interfaces.
         * A class can implement any number of interfaces.
         */
        Dog dog = new Dog();
        dog.makeSound(); // Abstract method implementation
        dog.sleep();     // Regular method
    }
}
