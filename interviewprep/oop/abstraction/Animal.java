package oop.abstraction;

abstract class Animal {
    // Abstract method (no implementation)
    abstract void makeSound();

    // Regular method
    void sleep() {
        System.out.println("This animal is sleeping.");
    }
}
