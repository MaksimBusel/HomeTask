package by.epam.task2.creator;

import by.epam.task2.entity.EngineType;
import by.epam.task2.Locomotive;
import by.epam.task2.exception.LessZeroException;
import by.epam.task2.reader.TxtReader;

import java.util.ArrayList;
import java.util.List;

public class CreatorLocomotive {

    public List<Locomotive> createLocomotives(List arguments) {
        List<Locomotive> locomotives = new ArrayList<>();
        for (int i = 0; i < arguments.size(); i++) {
            String time = (String) arguments.get(i);
            String[] parameters = time.trim().split(":");
            EngineType engine = EngineType.valueOf(parameters[0].toUpperCase().trim());
            int checkSpeed = Integer.valueOf(parameters[1].trim());
            if (checkSpeed<0){throw new LessZeroException();}
            int speed = checkSpeed;
            locomotives.add(new Locomotive(engine, speed));
        }
        return locomotives;
    }
}
