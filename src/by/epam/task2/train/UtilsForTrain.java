package by.epam.task2.train;

import by.epam.task2.carriage.PassengerCarriage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UtilsForTrain {

    public int calculateNumberOfPassengers(List<PassengerCarriage> list) {
        int people = 0;
        for (PassengerCarriage carriage : list) {
            people += carriage.getCarriageType().getNumberOfSeats();
        }
        return people;
    }

    public int calculateBaggageWeight(List<PassengerCarriage> list){
        int baggage =0;
        for (PassengerCarriage carriage : list) {
            baggage += carriage.getBaggageWeight();
        }
        return baggage;
    }

    public void sortCarriage(List<PassengerCarriage>list){
        Collections.sort(list, new ComparatorTrain());
    }
}
