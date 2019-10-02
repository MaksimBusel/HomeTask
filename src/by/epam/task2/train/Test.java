package by.epam.task2.train;

import by.epam.task2.carriage.CarriageType;
import by.epam.task2.carriage.PassengerCarriage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<PassengerCarriage> list= new ArrayList<>();
        list.add(new PassengerCarriage(CarriageType.COMMON,200));
        list.add(new PassengerCarriage(CarriageType.COUPE,100));
        list.add(new PassengerCarriage(CarriageType.SEAT,1200));
        list.add(new PassengerCarriage(CarriageType.ECONOM_CLASS,400));
        UtilsForTrain train = new UtilsForTrain();
        train.sortCarriage(list);
        for (PassengerCarriage as:list) {
            System.out.println(as);
        }
    }
}
