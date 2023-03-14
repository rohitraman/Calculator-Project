package org.example.factory;

import org.example.implementation.Factorial;
import org.example.implementation.NaturalLogarithm;
import org.example.implementation.Power;
import org.example.implementation.SquareRoot;
import org.example.interfaces.CalculatorInterface;

public class CalculatorFactory {
    public static CalculatorInterface get(int ch) {
        switch (ch) {
            case 1 : return new SquareRoot();
            case 2 : return new Factorial();
            case 3 : return new NaturalLogarithm();
            case 4 : return new Power();
        }
        return null;
    }
}
