package ru.sber.unitTest.main;

public class Operations {
    public double summation(double a, double b) {
        return a + b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        return a / b;
    }

    public double involution(double a, int power) {
        double result = 1;
        for (int i = 0; i < power;i++) {
            result = result * a;
        }
        return result;
    }
}
