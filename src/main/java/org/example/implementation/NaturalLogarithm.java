package org.example.implementation;

import org.apache.log4j.Logger;
import org.example.interfaces.CalculatorInterface;

public class NaturalLogarithm implements CalculatorInterface {
    Logger logger = Logger.getLogger(NaturalLogarithm.class);
    @Override
    public double calculate(int a) {
        double naturalLog = Math.log(a);
        logger.info("Natural Logarithm -- Input : " + a + " Output : " +  naturalLog);
        return naturalLog;
    }
}
