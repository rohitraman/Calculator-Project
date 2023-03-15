package org.example.implementation;

import org.apache.log4j.Logger;
import org.example.interfaces.CalculateInterface;

public class Factorial implements CalculateInterface {
    Logger logger = Logger.getLogger(SquareRoot.class);
    @Override
    public double calculate(int a, int b) {
        double fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        logger.info("Factorial -- Input : " + a + " Output : " +  fact);
        return fact;
    }
}
