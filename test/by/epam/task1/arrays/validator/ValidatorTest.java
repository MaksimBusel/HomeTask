package by.epam.task1.arrays.validator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidatorTest {
    private Validator validator;

    @Before
    public void setUp() throws Exception {
        validator = new Validator();
    }

    @Test
    public void successCheckOnValidity() {
        String forCheck = "24 -22 234.1 -32.1";
        boolean resultValidation = validator.checkStringOnValidity(forCheck);
        Assert.assertTrue(resultValidation);
    }

    @Test
    public void failedCheckOnValidity() {
        String forCheck = "2 22a 234.1 32.1";
        boolean resultValidation = validator.checkStringOnValidity(forCheck);
        Assert.assertFalse(resultValidation);
    }
}