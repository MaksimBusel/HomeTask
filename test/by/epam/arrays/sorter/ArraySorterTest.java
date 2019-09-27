package by.epam.arrays.sorter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySorterTest {
    ArraySorter arraySorter;
    private int[] arrayForCheck = {212,12,32,0,245,1,21};

    @Before
    public void setUp() throws Exception {
        arraySorter =  new ArraySorter();
    }

    @Test
    public void sortArraysMethodBubbles() {
        int[] expected = {0,1,12,21,32,212,245};
        int[] sort = arraySorter.sortArraysMethodBubbles(arrayForCheck);
        Assert.assertArrayEquals(expected,sort);
    }

    @Test
    public void sortArraysMethodSelection() {
        int[] expected = {0,1,12,21,32,212,245};
        int[] sort = arraySorter.sortArraysMethodSelection(arrayForCheck);
        Assert.assertArrayEquals(expected,sort);
    }

    @Test
    public void sortArraysMethodInsertion() {
        int[] expected = {0,1,12,21,32,212,245};
        int[] sort = arraySorter.sortArraysMethodInsertion(arrayForCheck);
        Assert.assertArrayEquals(expected,sort);
    }
}