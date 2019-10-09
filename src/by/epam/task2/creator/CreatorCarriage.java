package by.epam.task2.creator;

import by.epam.task2.constant.Constants;
import by.epam.task2.entity.CarriageType;
import by.epam.task2.PassengerCarriage;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class CreatorCarriage {
    private Logger log = Logger.getLogger(CreatorCarriage.class);

    public List<PassengerCarriage> createCarriages(List arguments) {
        List<PassengerCarriage> passengerCarriages = new ArrayList<>();
        for (int i = 0; i < arguments.size(); i++) {
            String time = (String) arguments.get(i);
            String[] parameters = time.trim().split(Constants.FOR_SPLIT);
            CarriageType carriageType = CarriageType.valueOf(parameters[0].toUpperCase().trim());
            log.info("Check people and luggage were not negative");
            int numberOfSeats = CreatorTrain.checkOnPositive(Integer.valueOf(parameters[1].trim()));
            int baggageWeight = CreatorTrain.checkOnPositive(Integer.valueOf(parameters[2].trim()));
            passengerCarriages.add(new PassengerCarriage(carriageType, numberOfSeats, baggageWeight));
        }
        return passengerCarriages;
    }
}
