package by.epam.arrays.creator;

import by.epam.arrays.exception.ArraySizeException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayCreatorTest {
    ArrayCreator arrayCreator;

    @Before
    public void setUp() throws Exception {
        arrayCreator = new ArrayCreator();
    }

    @Test
    public void checkCorrectSizeArray() {
        int arraySize = 10;
        int[] arrayTest = arrayCreator.createArray(arraySize);
        Assert.assertEquals(10, arrayTest.length);
    }

    @Test(expected = ArraySizeException.class)
    public void mustThrowArraySizeException() {
        int[] arrayTest = arrayCreator.createArray(-1);
    }
}