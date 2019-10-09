package by.epam.task2.validator;

import by.epam.task2.exception.ValidationException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorArgumentsTest {
    ValidatorArguments validatorArguments;

    @Before
    public void setUp() throws Exception {
        validatorArguments = new ValidatorArguments();
    }

    @Test
    public void checkCarriagePattern() {
        String test = "     COUPE   :   21: 234    ";
        byte check = validatorArguments.checkString(test);
        Assert.assertEquals(0, check);
    }

    @Test
    public void checkLocomotivePattern() {
        String test = "     DIESEL   : 120";
        byte check = validatorArguments.checkString(test);
        Assert.assertEquals(1, check);
    }

    @Test(expected = ValidationException.class)
    public void mustThrowValidationException() {
        String test = "  any:  12  : 120";
        validatorArguments.checkString(test);
        }

    @Test(expected = ValidationException.class)
    public void shouldThrowValidationException() {
        String test = "COUPE:12:-120";
        validatorArguments.checkString(test);
    }
}