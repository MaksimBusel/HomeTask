package by.epam.arrays.creator;

import by.epam.arrays.exception.ExceptionSizeArray;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayCreatorTest {
    ArrayCreator arrayCreator;

    @Before
    public void setUp() throws Exception {
        arrayCreator = new ArrayCreator();
    }

    @Test
    public void checkCorrectSizeArray() {
        int sizeArray = 10;
        int[] arrayForTest = arrayCreator.createArrayNeedSize(sizeArray);
        Assert.assertEquals(10, arrayForTest.length);
    }

    @Test(expected = ExceptionSizeArray.class)
    public void mustThrowExceptionSizeArray() {
        int[] arrayForTest = arrayCreator.createArrayNeedSize(-1);
    }
}