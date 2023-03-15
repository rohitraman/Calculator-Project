package org.example.implementation;

import org.apache.log4j.Logger;
import org.example.interfaces.CalculateInterface;

public class SquareRoot implements CalculateInterface {
    Logger logger = Logger.getLogger(SquareRoot.class);
    @Override
    public double calculate(int a, int b) {
        Double answer = Math.sqrt(a);
        logger.info("Square Root -- Input : " + a + " Output : " +  answer);
        return answer;
    }
}
