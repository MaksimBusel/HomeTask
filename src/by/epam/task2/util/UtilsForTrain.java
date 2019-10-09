package by.epam.task2.util;

import by.epam.task2.PassengerCarriage;

import java.util.Collections;
import java.util.List;

public class UtilsForTrain {

    public int calculateNumberOfPassengers(List<PassengerCarriage> list) {
        int people = 0;
        for (PassengerCarriage carriage : list) {
            people += carriage.getNumberOfSeats();
        }
        return people;
    }

    public int calculateBaggageWeight(List<PassengerCarriage> list) {
        int baggage = 0;
        for (PassengerCarriage carriage : list) {
            baggage += carriage.getBaggageWeight();
        }
        return baggage;
    }

    public void sortOnPassengers(List<PassengerCarriage> list) {
        Collections.sort(list, new ComparatorPeople());
    }

    public void sortOnPassengersAndBaggage(List<PassengerCarriage> list) {
        Collections.sort(list, new ComparatorPeople().thenComparing(new ComparatorBaggage()));
    }
}
