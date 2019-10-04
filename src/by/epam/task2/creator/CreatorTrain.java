package by.epam.task2.creator;

import by.epam.task2.Locomotive;
import by.epam.task2.PassengerCarriage;
import by.epam.task2.RailwayTransport;
import java.util.ArrayList;
import java.util.List;

public class CreatorTrain {

    public List<RailwayTransport> createTrain(List<PassengerCarriage> passenger, List<Locomotive> locomotives) {
        List<RailwayTransport> train = new ArrayList<>();
        train.addAll(passenger);
        train.addAll(locomotives);
        return train;
    }
}
