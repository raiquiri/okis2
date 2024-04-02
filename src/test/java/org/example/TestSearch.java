package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.example.Search.binSearch;
import static org.example.Sort.quickSort;

public class TestSearch {
    @Test(groups = {"search", "positive"})
    void testBinSearchInt() {
        // Arange - создание окружения
        int[] array = new int[] {1,23,4,5,67,7,8};
        int target = 4;
        int expectedResult = 1;
        int actualResult;
        // Act - действие
        quickSort(array, 0, array.length - 1);
        actualResult = binSearch(array, target);
        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(groups = {"search", "positive"})
    void testBinSearchDouble() {
        // Arange - создание окружения
        double[] array = new double[] {1.43,23.13,4.4,5.14,67.67,7.76,8.1};
        double target = 4.4;
        int expectedResult = 1;
        int actualResult;
        // Act - действие
        quickSort(array, 0, array.length - 1);
        actualResult = binSearch(array, target);
        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
