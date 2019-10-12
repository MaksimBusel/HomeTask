package by.epam.arrays.utils;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UtilsForArrayTest {
    private UtilsForArray utilsForArray;
    private int[] arrayForCheck = {212,12,32,0,245,1};

    @Before
    public void setUp() throws Exception {
        utilsForArray = new UtilsForArray();
    }

    @Test
    public void findMinNumberInArray() {
        int min = utilsForArray.findMin(arrayForCheck);
        Assert.assertEquals(0, min);
    }

    @Test
    public void findMaxNumberInArray() {
        int max = utilsForArray.findMax(arrayForCheck);
        Assert.assertEquals(245, max);
    }

    @Test
    public void calculateSumNumbersArray() {
        int sum = utilsForArray.calculateSum(arrayForCheck);
        Assert.assertEquals(502, sum);
    }
}