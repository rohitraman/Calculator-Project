package org.example.implementation;

import org.apache.log4j.Logger;
import org.example.interfaces.CalculatorInterface;

public class Factorial implements CalculatorInterface {
    Logger logger = Logger.getLogger(SquareRoot.class);
    @Override
    public double calculate(int a) {
        double fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        logger.info("Factorial -- Input : " + a + " Output : " +  fact);
        return fact;
    }
}
