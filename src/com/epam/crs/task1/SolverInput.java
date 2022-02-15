package com.epam.crs.task1;

import java.util.Scanner;

public class SolverInput {

    public int getConsoleIntValue(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);

        while(!scanner.hasNextInt()) {
            System.out.println(message);
            scanner.next();
        }

        return scanner.nextInt();
    }

    public double getConsoleDoubleValue(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);

        while(!scanner.hasNextDouble()) {
            System.out.println(message);
            scanner.next();
        }

        return scanner.nextDouble();
    }

    public int getConsoleEvenIntValue(String message) {
        int result;
        for(result = getConsoleIntValue(message); result % 2 != 0; result = getConsoleIntValue(message)) {
            System.out.println("The integer has to be even");
        }

        return result;
    }
}
