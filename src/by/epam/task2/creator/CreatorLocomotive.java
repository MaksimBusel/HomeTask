package by.epam.task2.creator;

import by.epam.task2.constant.Constants;
import by.epam.task2.entity.EngineType;
import by.epam.task2.Locomotive;
import by.epam.task2.reader.TxtReader;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class CreatorLocomotive {
    private Logger log = Logger.getLogger(CreatorLocomotive.class);

    public List<Locomotive> createLocomotives(List arguments) {
        List<Locomotive> locomotives = new ArrayList<>();
        for (int i = 0; i < arguments.size(); i++) {
            String time = (String) arguments.get(i);
            String[] parameters = time.trim().split(Constants.FOR_SPLIT);
            EngineType engine = EngineType.valueOf(parameters[0].toUpperCase().trim());
            log.info("Check speed was not negative");
            int speed = CreatorTrain.checkOnPositive(Integer.valueOf(parameters[1].trim()));
            locomotives.add(new Locomotive(engine, speed));
        }
        return locomotives;
    }
}
