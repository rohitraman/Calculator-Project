package org.example.implementation;

import org.apache.log4j.Logger;
import org.example.interfaces.CalculatorInterface;

public class SquareRoot implements CalculatorInterface {
    Logger logger = Logger.getLogger(SquareRoot.class);
    @Override
    public double calculate(int a) {
        Double answer = Math.sqrt(a);
        logger.info("Square Root -- Input : " + a + " Output : " +  answer);
        return answer;
    }
}
