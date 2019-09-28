package by.epam.arrays.sorter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArraySorterTest {
    ArraySorter arraySorter;
    private int[] arrayForCheck = {212,12,32,0,245,1,21};

    @Before
    public void setUp() throws Exception {
        arraySorter =  new ArraySorter();
    }

    @Test
    public void checkBubbleSort() {
        int[] expected = {0,1,12,21,32,212,245};
        int[] sort = arraySorter.bubbleSort(arrayForCheck);
        Assert.assertArrayEquals(expected,sort);
    }

    @Test
    public void checkSelectionSort() {
        int[] expected = {0,1,12,21,32,212,245};
        int[] sort = arraySorter.selectionSort(arrayForCheck);
        Assert.assertArrayEquals(expected,sort);
    }

    @Test
    public void checkInsertionSort() {
        int[] expected = {0,1,12,21,32,212,245};
        int[] sort = arraySorter.insertionSort(arrayForCheck);
        Assert.assertArrayEquals(expected,sort);
    }
}