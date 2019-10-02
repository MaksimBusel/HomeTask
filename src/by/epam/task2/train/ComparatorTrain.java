package by.epam.task2.train;

import by.epam.task2.carriage.PassengerCarriage;

import java.util.Comparator;

public class ComparatorTrain implements Comparator<PassengerCarriage> {

    @Override
    public int compare(PassengerCarriage o1, PassengerCarriage o2) {
        return o1.getCarriageType().getNumberOfSeats() - o2.getCarriageType().getNumberOfSeats();
    }
}
