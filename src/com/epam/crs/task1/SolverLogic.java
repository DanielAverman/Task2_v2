package com.epam.crs.task1;

public class SolverLogic {

    public boolean isFirst2DigitsEqualLast(int number) {
        return number % 100 == number / 100;
    }

    public double findMinPlusMax(double x, double y, double z) {
        return Math.min(Math.min(x, y), z) + Math.max(Math.max(x, y), z);
    }

    public int[][] createTemplateMatrix(int n) {
        int[][] template = new int[n][n];

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                template[i][j] = i % 2 == 0 ? j + 1 : n - j;
            }
        }

        return template;
    }
}
