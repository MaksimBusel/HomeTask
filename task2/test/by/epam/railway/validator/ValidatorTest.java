package by.epam.railway.validator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidatorTest {
    private Validator validator;
    private boolean check;

    @Before
    public void setUp() throws Exception {
        validator = new Validator();
    }

    @Test
    public void checkCarriagePattern() {
        String test = "  carriage:   COUPE   :   21: 234    ";
        check = validator.validate(test);
        Assert.assertTrue(check);
    }

    @Test
    public void checkLocomotivePattern() {
        String test = "  locomotive :   DIESEL   : 120";
        check = validator.validate(test);
        Assert.assertTrue(check);
    }

    @Test
    public void checkFailed() {
        String test = " carriage: any:  12  : 120";
        check = validator.validate(test);
        Assert.assertFalse(check);
        }
}