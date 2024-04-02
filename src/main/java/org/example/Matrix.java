package org.example;

public class Matrix {
    public static double determinant(int array[][]) throws Exception {
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[i].length) {
                throw new MatrixLenghtException("Ошибка размерности");
            }
        }

        double res;

        if (array.length == 1) { // матрица 1х1
            res = array[0][0];

        } else if (array.length == 2) { // матрица 2х2
            res = array[0][0]*array[1][1] - array[1][0]*array[0][1];

        } else { // матрица NxN
            res=0;
            for (int i = 0; i < array.length; i++){
                int[][] m = generateSubArray (array, i);
                res += Math.pow(-1.0, i + 2.0) * array[0][i] * determinant(m);
            }
        }
        return res;
    }
    private static int[][] generateSubArray (int array[][], int value){
        int[][] m = new int[array.length-1][];
        for (int i = 0; i < (array.length - 1); i++) {
            m[i] = new int[array.length - 1];
        }

        for (int i = 1; i < array.length; i++){
            int j2 = 0;
            for (int j = 0; j < array.length; j++){
                if(j == value)
                    continue;
                m[i-1][j2] = array[i][j];
                j2++;
            }
        }
        return m;
    }
    public static double determinant(double array[][]) throws Exception{
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[i].length) {
                throw new MatrixLenghtException("Ошибка размерности");
            }
        }
        double res;

        if (array.length == 1) { // матрица 1х1
            res = array[0][0];

        } else if (array.length == 2) { // матрица 2х2
            res = array[0][0]*array[1][1] - array[1][0]*array[0][1];

        } else { // матрица NxN
            res = 0;
            for (int i = 0; i < array.length; i++){
                double[][] m = generateSubArray (array, i);
                res += Math.pow(-1.0, i + 2.0) * array[0][i] * determinant(m);
            }
        }
        return res;
    }
    // создание миноров
    private static double[][] generateSubArray (double array[][], int value){
        double[][] subArray = new double[array.length-1][];
        for (int i = 0; i < (array.length - 1); i++) {
            subArray[i] = new double[array.length - 1];
        }

        for (int i = 1; i < array.length; i++){
            int j2 = 0;
            for (int j = 0; j < array.length; j++){
                if(j == value) {
                    continue;
                }
                subArray[i-1][j2] = array[i][j];
                j2++;
            }
        }
        return subArray;
    }
    public static class MatrixLenghtException extends Exception {
        public MatrixLenghtException(String massege){
            super(massege);
        }
    }
}
