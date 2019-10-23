package by.epam.railway.creator;

import by.epam.railway.entity.RailwayTransport;
import by.epam.railway.exception.NumberOfLocomotivesException;
import by.epam.railway.factory.FactoryRailwayTransport;
import org.apache.log4j.Logger;
import java.util.ArrayList;
import java.util.List;

public class TrainCreator {
    private static final Logger logger = Logger.getLogger(TrainCreator.class);

    public List<RailwayTransport> create(List<String> validParameters) {
        List<RailwayTransport> train = new ArrayList<>();
        FactoryRailwayTransport factoryRailwayTransport = new FactoryRailwayTransport();
        int size = validParameters.size();
        for (int i = 0; i < size; i++) {
            String time = validParameters.get(i).toUpperCase().trim();
            String[] arrayParameters = time.split(":");
            train.add(factoryRailwayTransport.createRailwayTransport(arrayParameters));
        }
        logger.info("Check the number of locomotives in train");
        int checkLocomotives = factoryRailwayTransport.countLocomotives;
        if(checkLocomotives>2||checkLocomotives<1){
            throw new NumberOfLocomotivesException("Incorrect number of locomotives in 1 train");
        }
        return train;
    }
}