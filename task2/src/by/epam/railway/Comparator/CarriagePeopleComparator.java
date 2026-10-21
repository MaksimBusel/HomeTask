package by.epam.railway.Comparator;

import by.epam.railway.entity.RailwayTransport;
import java.util.Comparator;

public class CarriagePeopleComparator implements Comparator<RailwayTransport> {

    @Override
    public int compare(RailwayTransport o1, RailwayTransport o2) {
        if (o1.getNumberOfSeats() > o2.getNumberOfSeats()) {
            return 1;
        }
        return -1;
    }
}
