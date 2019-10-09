package by.epam.task2.creator;

import by.epam.task2.Locomotive;
import by.epam.task2.exception.IncorrectValueException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class CreatorLocomotiveTest {
    CreatorLocomotive creatorLocomotive;
    List<Locomotive> locomotives;
    List list = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        creatorLocomotive = new CreatorLocomotive();
    }

    @Test
    public void mustCreateLocomotives() {
        list.add("ELECTRIC :   83");
        locomotives = creatorLocomotive.createLocomotives(list);
        Assert.assertNotNull(locomotives);
    }

    @Test(expected = IncorrectValueException.class)
    public void mustThrowIncorrectValueException() {
        list.add("DIESEL :   -100");
        locomotives = creatorLocomotive.createLocomotives(list);
    }
}