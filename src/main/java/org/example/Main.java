package org.example;

import org.apache.log4j.PropertyConfigurator;
import org.example.factory.CalculatorFactory;
import org.example.interfaces.CalculatorInterface;

import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Properties props = new Properties();
        props.load(Main.class.getResourceAsStream("/log4j.properties"));
        PropertyConfigurator.configure(props);
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Choose your option:");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");

            int ch = sc.nextInt();
            CalculatorInterface calculatorInterface = CalculatorFactory.get(ch);
            if (calculatorInterface == null) {
                System.out.println("Invalid option");
                return;
            }
            System.out.println("Enter a number:");
            int a = sc.nextInt();
            double answer = calculatorInterface.calculate(a);
            System.out.println("Answer:" + answer);
        } while (true);
    }
}