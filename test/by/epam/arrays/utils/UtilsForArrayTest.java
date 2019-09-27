package by.epam.arrays.utils;

import by.epam.arrays.utils.UtilsForArray;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilsForArrayTest {
    private UtilsForArray utilsForArray;
    private int[] arrayForCheck = {212,12,32,0,245,1};

    @Before
    public void setUp() throws Exception {
        utilsForArray = new UtilsForArray();
    }

    @Test
    public void findMinNumberInArray() {
        int min = utilsForArray.findMinNumberInArray(arrayForCheck);
        Assert.assertEquals(0, min);
    }

    @Test
    public void findMaxNumberInArray() {
        int max = utilsForArray.findMaxNumberInArray(arrayForCheck);
        Assert.assertEquals(245, max);
    }

    @Test
    public void calculateSumNumbersArray() {
        int sum = utilsForArray.calculateSumNumbersArray(arrayForCheck);
        Assert.assertEquals(502, sum);
    }
}