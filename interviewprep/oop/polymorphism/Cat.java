package oop.polymorphism;

class Cat extends Animal {
    // Method overriding - same method name, same parameters
    void makeSound() {
        System.out.println("The cat meows.");
    }
}
