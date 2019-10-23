package by.epam.railway.sort;

import by.epam.railway.Comparator.CarriageBaggageComparator;
import by.epam.railway.Comparator.CarriagePeopleComparator;
import by.epam.railway.entity.RailwayTransport;
import by.epam.railway.util.TrainUtils;
import org.apache.log4j.Logger;

import java.util.Collections;
import java.util.List;

public class Sorter {
    private static final Logger logger = Logger.getLogger(Sorter.class);

    public void sortOnPassengers(List<RailwayTransport> list) {
        Collections.sort(list, new CarriagePeopleComparator());
    }

    public void sortOnBaggage(List<RailwayTransport> list) {
        Collections.sort(list, new CarriageBaggageComparator());
    }

    public void sortOnPassengersAndBaggage(List<RailwayTransport> list) {
        logger.info("we sort the train by passengers and luggage");
        Collections.sort(list, new CarriagePeopleComparator().thenComparing(new CarriageBaggageComparator()));
    }
}
