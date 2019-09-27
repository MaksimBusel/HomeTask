package by.epam.arrays.validator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest {
    private Validator validator;

    @Before
    public void setUp() throws Exception {
        validator = new Validator();
    }

    @Test
    public void successPassCheckOnValidity() {
        String forCheck = "2 22 234.1 32.1";
        String[] resultValidation = validator.checkFileOnValidity(forCheck);
        Assert.assertNotNull(resultValidation);
    }

    @Test
    public void failedCheckOnValidity() {
        String forCheck = "2 22a 234.1 32.1";
        String[] resultValidation = validator.checkFileOnValidity(forCheck);
        Assert.assertNull(resultValidation);
    }
}