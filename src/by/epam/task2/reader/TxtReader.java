package by.epam.task2.reader;

import by.epam.task2.exception.ValidationException;
import by.epam.task2.validator.ValidatorArguments;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TxtReader {
    private List<String> argumentsForCarriage = new ArrayList();
    private List<String> argumentsForLocomotive = new ArrayList();
    private Logger log = Logger.getLogger(TxtReader.class);

    public void readTxt(String pathToFile) {
        try (BufferedReader readTxt = new BufferedReader(new FileReader(pathToFile))) {
            ValidatorArguments validator = new ValidatorArguments();
            String time;
            while ((time = readTxt.readLine()) != null) {
                byte result = 120;              //120 не приводит к дальнейшим действиям, 0 и 1 - используются в if-else
                try {
                    result = validator.checkString(time);
                } catch (ValidationException e) {
                    log.error("Invalid string!", e);
                    }
                if (result == 0) {
                    argumentsForCarriage.add(time);
                } else if (result == 1) {
                    argumentsForLocomotive.add(time);
                }
            }
        } catch (IOException e) {
            log.error("Error reading file",e);
            e.printStackTrace();
        }
    }

    public List<String> getArgumentsForCarriage() {
        return argumentsForCarriage;
    }

    public List<String> getArgumentsForLocomotive() {
        return argumentsForLocomotive;
    }
}
