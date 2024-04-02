package org.example;

public class Search {
    public static int binSearch (int[] array, int value) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int midpoint = (start + end) / 2;

            if (array[midpoint] == value) {
                return midpoint;
            } else {
                if (value < array[midpoint]) {
                    end = midpoint - 1;
                } else {
                    start = midpoint + 1;
                }
            }
        }
        return -1;
    }
    public static int binSearch (double[] array, double value) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int midpoint = (start + end) / 2;

            if (Math.abs(array[midpoint] - value) < 1e-5) {
                return midpoint;
            } else {
                if (value < array[midpoint]) {
                    end = midpoint - 1;
                } else {
                    start = midpoint + 1;
                }
            }
        }
        return -1;
    }
}
