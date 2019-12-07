package com.kodilla;

public class Calculator {

    public void addition(int a, int b) {
        System.out.println("Sum equal: " + (a+b));
    }

    public void subtraction(int c, int d) {
        System.out.println("Difference equal: " + (c-d));
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        calculator.addition(4, 7);
        calculator.subtraction(44, 23);
    }
}
