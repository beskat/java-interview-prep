package oop.inheritance;

public class InheritanceExample {
    public static void main(String[] args) {
        /*
         * Inheritance is a mechanism wherein a new class is derived from an existing class.
         * The new class inherits all the features from the parent class and can have additional features of its own.
         */
        Dog dog = new Dog();
        dog.eat();  // Inherited method
        dog.bark(); // Child class method
    }
}
