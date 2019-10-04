package by.epam.task2.creator;

import by.epam.task2.entity.CarriageType;
import by.epam.task2.PassengerCarriage;
import by.epam.task2.exception.LessZeroException;
import by.epam.task2.reader.TxtReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreatorCarriage {

    public List<PassengerCarriage> createCarriages() {
        TxtReader txt = new TxtReader();
        List<PassengerCarriage> passengerCarriages = new ArrayList<>();
        List arguments = txt.getArgumentsForCarriage();
        for (int i = 0; i < arguments.size(); i++) {
            String time = (String) arguments.get(i);
            String[] parameters = time.split(" ");
            CarriageType carriageType = CarriageType.valueOf(parameters[0].toUpperCase().trim());
            int checkPassenger= Integer.valueOf(parameters[1].trim());
            if(checkPassenger<0){throw new LessZeroException();}
            int numberOfSeats= checkPassenger;
            int checkBaggage = Integer.valueOf(parameters[2].trim());
            if (checkBaggage<0){throw new LessZeroException();}
            int baggageWeight = checkBaggage;
            passengerCarriages.add(new PassengerCarriage(carriageType, numberOfSeats, baggageWeight));
        }
        return passengerCarriages;
    }
}
