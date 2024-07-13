package oop.polymorphism;

public class PolymorphismOverloadingExample {
    public static void main(String[] args) {
        MathOperations operations = new MathOperations();
        System.out.println("Sum of integers: " + operations.add(5, 3));
        System.out.println("Sum of doubles: " + operations.add(5.5, 3.5));
    }
}
