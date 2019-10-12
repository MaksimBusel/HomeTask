package by.epam.railway.util;

import by.epam.task2.entity.PassengerCarriage;
import by.epam.task2.entity.CarriageType;
import by.epam.task2.entity.RailwayTransport;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class UtilsForTrainTest {
    TrainUtils utils;
    List<RailwayTransport> list= new ArrayList<>();
    Object[] arraySorted = new Object[4];

    @Before
    public void setUp() throws Exception {
        utils =  new TrainUtils();
        list.add(new PassengerCarriage(CarriageType.SEAT, 67, 220));
        list.add(new PassengerCarriage(CarriageType.COUPE, 22, 80));
        list.add(new PassengerCarriage(CarriageType.ECONOM, 61, 240));
        list.add(new PassengerCarriage(CarriageType.SV, 22, 120));
    }

    @Test
    public void checkCalculatePassengers() {
        int sum = utils.countPassengers(list);
        Assert.assertEquals(172, sum);
    }

    @Test
    public void checkCalculateBaggage() {
        int sum = utils.countBaggage(list);
        Assert.assertEquals(660, sum);
    }

    @Test
    public void checkSortPassengers() {
        arraySorted[0] = new PassengerCarriage(CarriageType.SEAT, 67, 220);
        arraySorted[1] = new PassengerCarriage(CarriageType.ECONOM, 61, 240);
        arraySorted[2] = new PassengerCarriage(CarriageType.COUPE, 22, 80);
        arraySorted[3] = new PassengerCarriage(CarriageType.SV, 22, 120);
        utils.sortOnPassengers(list);
        Object[] forCheck = list.toArray();
        Assert.assertArrayEquals(arraySorted, forCheck);
    }

    @Test
    public void checkSortPassengersAndBaggage() {
        arraySorted[0] = new PassengerCarriage(CarriageType.SEAT, 67, 220);
        arraySorted[1] = new PassengerCarriage(CarriageType.ECONOM, 61, 240);
        arraySorted[2] = new PassengerCarriage(CarriageType.SV, 22, 120);
        arraySorted[3] = new PassengerCarriage(CarriageType.COUPE, 22, 80);
        utils.sortOnPassengersAndBaggage(list);
        Object[] forCheck = list.toArray();
        Assert.assertArrayEquals(arraySorted, forCheck);
    }
}