package org.example.implementation;

import org.apache.log4j.Logger;
import org.example.interfaces.CalculateInterface;

public class Power implements CalculateInterface {
    Logger logger = Logger.getLogger(Power.class);
    @Override
    public double calculate(int a, int b) {
        double power = Math.pow(a, b);
        logger.info("Power -- Input : a = " + a + " b = " + b + " Output : " +  power);
        return power;
    }

}
