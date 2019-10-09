package by.epam.task2.util;

import by.epam.task2.PassengerCarriage;
import by.epam.task2.entity.CarriageType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class UtilsForTrainTest {
    UtilsForTrain utilsForTrain;
    List<PassengerCarriage> list= new ArrayList<>();
    Object[] test = new Object[4];

    @Before
    public void setUp() throws Exception {
        utilsForTrain =  new UtilsForTrain();
        list.add(new PassengerCarriage(CarriageType.SEAT, 67, 220));
        list.add(new PassengerCarriage(CarriageType.COUPE, 22, 120));
        list.add(new PassengerCarriage(CarriageType.ECONOM, 61, 240));
        list.add(new PassengerCarriage(CarriageType.SV, 22, 80));
    }

    @Test
    public void checkCalculatePassengers() {
        int sum = utilsForTrain.calculateNumberOfPassengers(list);
        Assert.assertEquals(172, sum);
    }

    @Test
    public void checkCalculateBaggage() {
        int sum = utilsForTrain.calculateBaggageWeight(list);
        Assert.assertEquals(660, sum);
    }

    @Test
    public void checkSortPassengers() {
        test[0] = new PassengerCarriage(CarriageType.SEAT, 67, 220);
        test[1] = new PassengerCarriage(CarriageType.ECONOM, 61, 240);
        test[2] = new PassengerCarriage(CarriageType.COUPE, 22, 120);
        test[3] = new PassengerCarriage(CarriageType.SV, 22, 80);
        utilsForTrain.sortOnPassengers(list);
        Object[] forCheck = list.toArray();
        Assert.assertArrayEquals(test, forCheck);
    }

    @Test
    public void checkSortPassengersAndBaggage() {
        test[0] = new PassengerCarriage(CarriageType.SEAT, 67, 220);
        test[1] = new PassengerCarriage(CarriageType.ECONOM, 61, 240);
        test[2] = new PassengerCarriage(CarriageType.COUPE, 22, 120);
        test[3] = new PassengerCarriage(CarriageType.SV, 22, 80);
        utilsForTrain.sortOnPassengers(list);
        Object[] forCheck = list.toArray();
        Assert.assertArrayEquals(test, forCheck);
    }
}