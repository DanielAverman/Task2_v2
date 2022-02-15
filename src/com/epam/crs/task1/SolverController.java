package com.epam.crs.task1;

public class SolverController {

    public static void main(String[] args) {
        SolverLogic logic = new SolverLogic();
        SolverInput input = new SolverInput();
        SolverView view = new SolverView();

        processIsFirst2DigitsEqualLast(input, logic, view);
        processFindMinPlusMax(input, logic, view);
        processCreateTemplateMatrix(input, logic, view);
    }

    private static void processIsFirst2DigitsEqualLast(SolverInput input, SolverLogic logic, SolverView view) {
        int number = input.getConsoleIntValue("Enter integer: ");
        boolean result = logic.isFirst2DigitsEqualLast(number);
        view.printBoolean(number, result);
    }

    private static void processFindMinPlusMax(SolverInput input, SolverLogic logic, SolverView view) {
        double x = input.getConsoleDoubleValue("Enter first double: ");
        double y = input.getConsoleDoubleValue("Enter second double: ");
        double z = input.getConsoleDoubleValue("Enter third double: ");
        double sum = logic.findMinPlusMax(x, y, z);
        view.printMinPlusMax(x, y, z, sum);
    }

    private static void processCreateTemplateMatrix(SolverInput input, SolverLogic logic, SolverView view) {
        int n = input.getConsoleEvenIntValue("Enter even integer: ");
        int[][] templateMatrix = logic.createTemplateMatrix(n);
        view.printTemplateMatrix(templateMatrix);
    }
}
