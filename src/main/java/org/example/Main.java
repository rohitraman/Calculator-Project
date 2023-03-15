package org.example;

import org.apache.log4j.PropertyConfigurator;
import org.example.factory.CalculatorFactory;
import org.example.interfaces.CalculateInterface;

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
            sc.nextLine();
            System.out.println("Choose your option:");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Logarithm");
            System.out.println("4. Power(a,b)");

            int ch = sc.nextInt();
            CalculateInterface calculatorInterface = CalculatorFactory.get(ch);
            if (calculatorInterface == null) {
                System.out.println("Invalid option");
                return;
            }
            System.out.println("Enter a number:");
            int a = sc.nextInt();
            int b = Integer.MAX_VALUE;
            if (ch == 4) {
                System.out.println("Enter second number: ");
                b = sc.nextInt();
            }
            double answer = calculatorInterface.calculate(a, b);
            System.out.println("Answer:" + answer);
        } while (true);
    }
}