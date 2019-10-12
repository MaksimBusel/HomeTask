package by.epam.task2.util;

import by.epam.task2.creator.TrainCreator;
import by.epam.task2.entity.RailwayTransport;
import org.apache.log4j.Logger;

import java.util.Collections;
import java.util.List;

public class TrainUtils {
    private static final Logger logger = Logger.getLogger(TrainUtils.class);

    public int countPassengers(List<RailwayTransport> list) {
        int people = 0;
        for (RailwayTransport transport : list) {
            people += transport.getNumberOfSeats();
        }
        return people;
    }

    public int countBaggage(List<RailwayTransport> list) {
        int baggage = 0;
        for (RailwayTransport transport : list) {
            baggage += transport.getBaggageWeight();
        }
        return baggage;
    }

    public void sortOnPassengers(List<RailwayTransport> list) {
        Collections.sort(list, new ComparatorPeople());
    }

    public void sortOnBaggage(List<RailwayTransport> list) {
        Collections.sort(list, new ComparatorBaggage());
    }

    public void sortOnPassengersAndBaggage(List<RailwayTransport> list) {
        logger.info("we sort the train by passengers and luggage");
        Collections.sort(list, new ComparatorPeople().thenComparing(new ComparatorBaggage()));
    }
}
