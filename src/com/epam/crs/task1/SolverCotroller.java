package com.epam.crs.task1;

public class SolverCotroller {

    public static void main(String[] args) {
        SolverLogic logic = new SolverLogic();
        SolverInput input = new SolverInput();
        SolverView view = new SolverView();

        processIsFirst2DigitsEqualLast(input, logic, view);
        processFindMinPlusMax(input, logic, view);
        processCreateTemplateMatrix(input, logic, view);
    }

    private static void processIsFirst2DigitsEqualLast(SolverInput input, SolverLogic logic, SolverView view) {
        int number = input.getConsoleIntValue();
        boolean result = logic.isFirst2DigitsEqualLast(number);
        view.printBoolean(number, result);
    }

    private static void processFindMinPlusMax(SolverInput input, SolverLogic logic, SolverView view) {
        double x = input.getConsoleDoubleValue();
        double y = input.getConsoleDoubleValue();
        double z = input.getConsoleDoubleValue();
        double sum = logic.findMinPlusMax(x, y, z);
        view.printMinPlusMax(x, y, z, sum);
    }

    private static void processCreateTemplateMatrix(SolverInput input, SolverLogic logic, SolverView view) {
        int n = input.getConsoleEvenIntValue();
        int[][] templateMatrix = logic.createTemplateMatrix(n);
        view.printTemplateMatrix(templateMatrix);
    }
}
