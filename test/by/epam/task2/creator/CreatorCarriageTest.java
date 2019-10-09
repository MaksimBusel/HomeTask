package by.epam.task2.creator;

import by.epam.task2.PassengerCarriage;
import by.epam.task2.exception.IncorrectValueException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CreatorCarriageTest {
    CreatorCarriage creatorCarriage;
    List<PassengerCarriage> passengerCarriages;
    List list = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        creatorCarriage = new CreatorCarriage();
    }

    @Test
    public void mustCreateCarriage() {
        list.add("COMMON:   23  :  43");
        passengerCarriages = creatorCarriage.createCarriages(list);
        Assert.assertNotNull(passengerCarriages);
    }

    @Test(expected = IncorrectValueException.class)
    public void mustThrowIncorrectValueException() {
        list.add("COMMON:  33  :  -32");
        passengerCarriages = creatorCarriage.createCarriages(list);
        }
    }
