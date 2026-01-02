package com.assignment1;

class BasicMathOperations {

    // Addition
    static int add(int a, int b) {
        return a + b;
    }

    // Subtraction
    static int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication
    static int multiply(int a, int b) {
        return a * b;
    }

    // Division
    static int divide(int a, int b) {
        return a / b;
    }

    // Remainder
    static int remainder(int a, int b) {
        return a % b;
    }

    // Square
    static int square(int a) {
        return a * a;
    }

    // Cube
    static int cube(int a) {
        return a * a * a;
    }

    // Absolute value
    static int absolute(int a) {
        return (a < 0) ? -a : a;
    }

    public static void main(String[] args) {
        int a = 10, b = 3;

        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + subtract(a, b));
        System.out.println("Multiplication: " + multiply(a, b));
        System.out.println("Division: " + divide(a, b));
        System.out.println("Remainder: " + remainder(a, b));
        System.out.println("Square: " + square(a));
        System.out.println("Cube: " + cube(a));
        System.out.println("Absolute: " + absolute(-20));
    }
}
