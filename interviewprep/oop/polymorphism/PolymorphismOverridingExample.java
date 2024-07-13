package oop.polymorphism;

public class PolymorphismOverridingExample {
    /*
     * Polymorphism means "many forms" and it occurs when we have many classes that are related to each other by oop.inheritance.
     * There are two types of oop.polymorphism in Java: compile-time oop.polymorphism (method overloading) and runtime oop.polymorphism (method overriding).
     */
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myCat = new Cat();

        myAnimal.makeSound();
        myCat.makeSound();
    }
}
