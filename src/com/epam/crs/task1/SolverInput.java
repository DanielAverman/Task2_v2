package com.epam.crs.task1;

import java.util.Scanner;

public class SolverInput {

    public int getConsoleIntValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer: ");

        while(!scanner.hasNextInt()) {
            System.out.println("Enter integer: ");
            scanner.next();
        }

        return scanner.nextInt();
    }

    public double getConsoleDoubleValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter double: ");

        while(!scanner.hasNextDouble()) {
            System.out.println("Enter double: ");
            scanner.next();
        }

        return scanner.nextDouble();
    }

    public int getConsoleEvenIntValue() {
        int result;
        for(result = getConsoleIntValue(); result % 2 != 0; result = getConsoleIntValue()) {
            System.out.println("The integer has to be even");
        }

        return result;
    }
}
