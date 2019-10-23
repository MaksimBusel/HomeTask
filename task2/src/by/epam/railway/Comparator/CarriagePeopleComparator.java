package by.epam.railway.Comparator;

import by.epam.railway.entity.RailwayTransport;
import java.util.Comparator;

public class CarriagePeopleComparator implements Comparator<RailwayTransport> {

    @Override
    public int compare(RailwayTransport o1, RailwayTransport o2) {
        return o2.getNumberOfSeats() - o1.getNumberOfSeats();
    }
}
