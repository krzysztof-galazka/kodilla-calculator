package com.kodilla.kodillacalculator;

public class Calculator {

    public int add(int a, int b) {
        return a+b;
    }

    public int minus(int a, int b) {
        return a-b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(5,5);
        System.out.println("Add: "+calculator.add(8,5));
        System.out.println("Minus: "+calculator.minus(23,5));
    }
}

