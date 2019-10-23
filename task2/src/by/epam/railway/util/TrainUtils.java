package by.epam.railway.util;

import by.epam.railway.entity.RailwayTransport;
import org.apache.log4j.Logger;

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
}
