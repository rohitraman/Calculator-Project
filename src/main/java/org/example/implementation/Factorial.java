package org.example.implementation;

import org.example.interfaces.CalculatorInterface;

public class Factorial implements CalculatorInterface {
    @Override
    public double calculate(int a) {
        double fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
