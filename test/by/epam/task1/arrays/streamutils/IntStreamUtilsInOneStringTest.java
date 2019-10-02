package by.epam.task1.arrays.streamutils;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntStreamUtilsInOneStringTest {
    private IntStreamUtilsInOneString intStreamUtilsInOneString;
    private int[] arrayForCheck = {212,12,32,0,245,1,21};

    @Before
    public void setUp() throws Exception {
        intStreamUtilsInOneString = new IntStreamUtilsInOneString();
    }

    @Test
    public void findMinNumber() {
        int min = intStreamUtilsInOneString.findMin(arrayForCheck);
        Assert.assertEquals(0,min);
    }

    @Test
    public void findMaxNumber() {
        int max = intStreamUtilsInOneString.findMax(arrayForCheck);
        Assert.assertEquals(245,max);
    }

    @Test
    public void findAverageNumbers() {
        int average = intStreamUtilsInOneString.findAverage(arrayForCheck);
        Assert.assertEquals(74,average);
    }

    @Test
    public void findSumNumbers() {
        int sum = intStreamUtilsInOneString.findSum(arrayForCheck);
        Assert.assertEquals(523,sum);
    }

    @Test
    public void sortArrayInt() {
        int[] expected = {0,1,12,21,32,212,245};
        int[] sort = intStreamUtilsInOneString.sortArrayInt(arrayForCheck);
        Assert.assertArrayEquals(expected,sort);
    }
}