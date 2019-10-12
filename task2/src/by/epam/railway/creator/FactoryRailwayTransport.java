package by.epam.railway.creator;

import by.epam.task2.entity.*;
import by.epam.task2.exception.InvalidTypeTransportException;
import org.apache.log4j.Logger;

public class FactoryRailwayTransport {
    private static final Logger logger = Logger.getLogger(FactoryRailwayTransport.class);
    int countLocomotives;

    public RailwayTransport createRailwayTransport(String[] parameters) {
        String typeTransport = parameters[0].trim();
        switch (typeTransport) {
            case "CARRIAGE": {
                PassengerCarriage passengerCarriage = new PassengerCarriage();
                passengerCarriage.setCarriageType(CarriageType.valueOf(parameters[1].trim()));
                passengerCarriage.setNumberOfSeats(Integer.valueOf(parameters[2].trim()));
                passengerCarriage.setBaggageWeight(Integer.valueOf(parameters[3].trim()));
                return passengerCarriage;
            }
            case "LOCOMOTIVE": {
                Locomotive locomotive = new Locomotive();
                locomotive.setEngineType(EngineType.valueOf(parameters[1].trim()));
                locomotive.setSpeed(Integer.valueOf(parameters[2].trim()));
                countLocomotives++;
                logger.info("increase the counter of locomotives ="+ countLocomotives);
                return locomotive;
            }
            default: {
                throw new InvalidTypeTransportException("Attempt to create a non-existent transport");
            }
        }
    }
}


