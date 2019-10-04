package by.epam.task2.creator;

import by.epam.task2.RailwayTransport;

import java.util.ArrayList;
import java.util.List;

public class CreatorTrain {

    public List<RailwayTransport> createTrain(){
       List<RailwayTransport> train = new ArrayList<>();
       train.addAll(new CreatorLocomotive().createLocomotives());
       train.addAll(new CreatorCarriage().createCarriages());
       return train;
      }
}
