package by.epam.task2.util;

import by.epam.task2.PassengerCarriage;
import java.util.Comparator;

public class ComparatorPeople implements Comparator<PassengerCarriage> {

    @Override
    public int compare(PassengerCarriage o1, PassengerCarriage o2) {
        return o2.getNumberOfSeats() - o1.getNumberOfSeats();
    }


}
