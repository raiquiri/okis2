package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.example.Matrix.*;


public class TestMatrix {
    @Test(groups = {"matrix", "positive"})
    void testDeterminantInt() {
        // Arange - создание окружения
        int[][] array = new int[][] {{1, 3, 4},
                                     {0, 2, 1},
                                     {1, 5, -1}};
        double expectedResult = -12;
        double actualResult;
        // Act - действие
        actualResult = determinant(array);
        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(groups = {"matrix", "positive"})
    void testDeterminantDouble() {
        // Arange - создание окружения
        double[][] array = new double[][] {{1.5, 3.2, 1.1},
                                           {0, 6.6, 4.5},
                                           {0.4, 1.2, 1}};
        double expectedResult = 4.656;
        double DELTA = 1e-4;
        double actualResult;
        // Act - действие
        actualResult = determinant(array);
        // Assert
        Assert.assertEquals(actualResult, expectedResult, DELTA);
    }
}
