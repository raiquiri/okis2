package org.example;

public class Sort {
    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int index = partition(array, start, end);
            quickSort(array, start, index - 1);
            quickSort(array, index, end);
        }
    }
    private static int partition(int[] array, int start, int end) {
        int leftIndex = start;
        int rightIndex = end;

        int ptr = array[leftIndex];
        while (leftIndex <= rightIndex) {
            while (array[leftIndex] < ptr) {
                leftIndex++;
            }
            while (array[rightIndex] > ptr) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                int temp = array[rightIndex];
                array[rightIndex] = array[leftIndex];
                array[leftIndex] = temp;

                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    public static void quickSort(double[] array, int start, int end) {
        if (start < end) {
            int index = partition(array, start, end);
            quickSort(array, start, index - 1);
            quickSort(array, index, end);
        }
    }
    private static int partition(double[] array, int start, int end) {
        int leftIndex = start;
        int rightIndex = end;

        double ptr = array[leftIndex];
        while (leftIndex <= rightIndex) {
            while (array[leftIndex] < ptr) {
                leftIndex++;
            }
            while (array[rightIndex] > ptr) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                double temp = array[rightIndex];
                array[rightIndex] = array[leftIndex];
                array[leftIndex] = temp;

                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    public static void combSort(int[] array) {
        int step = array.length;
        boolean check = true;

        while (step > 1 || check) {
            if (step > 1) {
                step = (int) (step/1.247);
            }
            check = false;
            for (int i = step; i < array.length; i++) {
                if (array[i-step] > array[i]) {
                    int temp = array[i];
                    array[i] = array[i-step];
                    array[i-step] = temp;
                    check = true;
                }
            }
        }
    }

    public static void combSort(double[] array) {
        int step = array.length;
        boolean check = true;

        while (step > 1 || check) {
            if (step > 1) {
                step = (int) (step/1.247);
            }
            check = false;
            for (int i = step; i < array.length; i++) {
                if (array[i-step] > array[i]) {
                    double temp = array[i];
                    array[i] = array[i-step];
                    array[i-step] = temp;
                    check = true;
                }
            }
        }
    }
}
