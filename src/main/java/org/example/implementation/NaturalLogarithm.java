package org.example.implementation;

import org.apache.log4j.Logger;
import org.example.interfaces.CalculateInterface;

public class NaturalLogarithm implements CalculateInterface {
    Logger logger = Logger.getLogger(NaturalLogarithm.class);
    @Override
    public double calculate(int a, int b) {
        double naturalLog = Math.log(a);
        logger.info("Natural Logarithm -- Input : " + a + " Output : " +  naturalLog);
        return naturalLog;
    }
}
