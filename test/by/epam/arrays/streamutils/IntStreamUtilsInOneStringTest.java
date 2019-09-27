package by.epam.arrays.streamutils;

import by.epam.arrays.utils.UtilsForArray;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntStreamUtilsInOneStringTest {
    private IntStreamUtilsInOneString intStreamUtilsInOneString;
    private int[] arrayForCheck = {212,12,32,0,245,1,21};

    @Before
    public void setUp() throws Exception {
        intStreamUtilsInOneString = new IntStreamUtilsInOneString();
    }

    @Test
    public void findMinNumber() {
        int min = intStreamUtilsInOneString.findMinNumber(arrayForCheck);
        Assert.assertEquals(0,min);
    }

    @Test
    public void findMaxNumber() {
        int max = intStreamUtilsInOneString.findMaxNumber(arrayForCheck);
        Assert.assertEquals(245,max);
    }

    @Test
    public void findAverageNumbers() {
        int average = intStreamUtilsInOneString.findAverageNumbers(arrayForCheck);
        Assert.assertEquals(74,average);
    }

    @Test
    public void findSumNumbers() {
        int sum = intStreamUtilsInOneString.findSumNumbers(arrayForCheck);
        Assert.assertEquals(523,sum);
    }

    @Test
    public void sortArrayInt() {
        int[] expected = {0,1,12,21,32,212,245};
        int[] sort = intStreamUtilsInOneString.sortArrayInt(arrayForCheck);
        Assert.assertArrayEquals(expected,sort);
    }
}