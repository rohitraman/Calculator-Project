package org.example.implementation;

import org.example.interfaces.CalculatorInterface;

public class SquareRoot implements CalculatorInterface {
    @Override
    public double calculate(int a) {
        return Math.sqrt(a);
    }
}
