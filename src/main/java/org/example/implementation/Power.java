package org.example.implementation;

import org.apache.log4j.Logger;
import org.example.interfaces.CalculatorInterface;

public class Power implements CalculatorInterface {
    Logger logger = Logger.getLogger(Power.class);
    @Override
    public double calculate(int a) {
        double power = Math.pow(a, 3);
        logger.info("Power -- Input : " + a + " Output : " +  power);
        return power;
    }
}
