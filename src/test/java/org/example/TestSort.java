package org.example;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.example.Sort.*;

public class TestSort {

    @DataProvider(name = "arrayInt")
    public Object[][] arrayInt() {
        int[] array = new int[] {13, 34, 25, 57, 46, 68};
        int[] expectedResult = new int[] {13, 25, 34, 46, 57, 68};
        return new Object[][] {{array, expectedResult}};
    }

    @DataProvider(name = "arrayDouble")
    public Object[][] arrayDouble() {
        double[] array = new double[] {13.56, 34.44, 25.87, 57.13, 46.24, 68.88};
        double[] expectedResult = new double[] {13.56, 25.87, 34.44, 46.24, 57.13, 68.88};
        return new Object[][] {{array, expectedResult}};
    }

    @Test (groups = {"sort", "positive"}, dataProvider = "arrayInt")
    void testQuickSort(int[] array, int[] expectedResult) {
        // Arange - создание окружения
        int[] actualResult;
        // Act - действие
        quickSort(array, 0, array.length - 1);
        actualResult = array;
        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test (groups = {"sort", "positive"}, dataProvider = "arrayDouble")
    void testQuickSort(double[] array, double[] expectedResult) {
        // Arange - создание окружения
        double[] actualResult;
        // Act - действие
        quickSort(array, 0, array.length - 1);
        actualResult = array;
        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test (groups = {"sort", "positive"}, dataProvider = "arrayInt")
    void testCombSort(int[] array, int[] expectedResult) {
        // Arange - создание окружения
        int[] actualResult;
        // Act - действие
        combSort(array);
        actualResult = array;
        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test (groups = {"sort", "positive"}, dataProvider = "arrayDouble")
    void testCombSort(double[] array, double[] expectedResult) {
        // Arange - создание окружения
        double[] actualResult;
        // Act - действие
        combSort(array);
        actualResult = array;
        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
