package by.epam.task2.util;

import by.epam.task2.PassengerCarriage;
import java.util.Comparator;

public class ComparatorBaggage implements Comparator<PassengerCarriage> {

    @Override
    public int compare(PassengerCarriage o1, PassengerCarriage o2) {
        return o2.getBaggageWeight() - o1.getBaggageWeight();
    }
}
