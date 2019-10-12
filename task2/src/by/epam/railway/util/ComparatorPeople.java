package by.epam.railway.util;

import by.epam.task2.entity.RailwayTransport;
import java.util.Comparator;

public class ComparatorPeople implements Comparator<RailwayTransport> {

    @Override
    public int compare(RailwayTransport o1, RailwayTransport o2) {
        return o2.getNumberOfSeats() - o1.getNumberOfSeats();
    }


}
