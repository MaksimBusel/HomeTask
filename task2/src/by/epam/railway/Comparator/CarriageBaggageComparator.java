package by.epam.railway.Comparator;

import by.epam.railway.entity.RailwayTransport;
import java.util.Comparator;

public class CarriageBaggageComparator implements Comparator<RailwayTransport> {

    @Override
    public int compare(RailwayTransport o1, RailwayTransport o2) {
        return o2.getBaggageWeight() - o1.getBaggageWeight();
    }
}

