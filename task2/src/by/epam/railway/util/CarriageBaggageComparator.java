package by.epam.railway.util;

import by.epam.task2.entity.RailwayTransport;
import java.util.Comparator;

public class ComparatorBaggage implements Comparator<RailwayTransport> {

    @Override
    public int compare(RailwayTransport o1, RailwayTransport o2) {
        return o2.getBaggageWeight() - o1.getBaggageWeight();
    }
}
