package org.example;

import org.example.factory.CalculatorFactory;
import org.example.interfaces.CalculatorInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
            System.out.println("Answer:" + calculatorInterface.calculate(a));
        } while (true);

    }
}