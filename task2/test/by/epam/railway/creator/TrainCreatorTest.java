package by.epam.railway.creator;

import by.epam.task2.entity.RailwayTransport;
import by.epam.task2.exception.IncorrectValueException;
import by.epam.task2.exception.InvalidTypeTransportException;
import by.epam.task2.exception.NumberOfLocomotivesException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TrainCreatorTest {
    TrainCreator trainCreator;
    List<String> parameters = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        trainCreator = new TrainCreator();
        parameters.add("carriage : SEAT: 67: 220");
        parameters.add("carriage: COUPE: 22: 80");
        parameters.add("carriage: ECONOM: 61: 240");
        parameters.add("carriage: SV: 22: 120");
        parameters.add("Locomotive: ELECTRIC:120");
        parameters.add("locomotive: DIESEL:100");
    }

    @Test
    public void createTrain() {
        List<RailwayTransport> train = trainCreator.create(parameters);
        int sizeTrain = train.size();
        Assert.assertEquals(6, sizeTrain);
    }

    @Test(expected = IncorrectValueException.class)
    public void throwIncorrectValueException() {
        parameters.add("carriage:SV:-45:100");
        trainCreator.create(parameters);
    }

    @Test(expected = NumberOfLocomotivesException.class)
    public void throwNumberOfLocomotivesException() {
        parameters.add("Locomotive:DIESEL:120");
        trainCreator.create(parameters);
    }

    @Test(expected = InvalidTypeTransportException.class)
    public void throwInvalidTypeTransportException() {
        parameters.add("CARGO :COMMON:45:100");
        trainCreator.create(parameters);
    }
}