package by.epam.task2.reader;

import by.epam.task2.exception.ValidationException;
import by.epam.task2.validator.ValidatorArguments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TxtReader {
    private List<String> argumentsForCarriage = new ArrayList();
    private List<String> argumentsForLocomotive = new ArrayList();

    public void readTxt(String pathToFile) {
        try (BufferedReader readTxt = new BufferedReader(new FileReader(pathToFile))) {
            ValidatorArguments validator = new ValidatorArguments();
            String time;
            while ((time = readTxt.readLine()) != null) {
                byte result = validator.checkString(time);
                if (result == 0) {
                    argumentsForCarriage.add(time);
                } else if (result == 1) {
                    argumentsForLocomotive.add(time);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (ValidationException e) {
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
