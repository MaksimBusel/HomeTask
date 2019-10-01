package by.epam.arrays.reader;

import by.epam.arrays.exception.FileEmptyException;
import by.epam.arrays.validator.Validator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TxtReader {
    public List<Double> doublesFromFile = new ArrayList<>();

    public List<Double> readTxtAndValidation(String pathToFile) {
        try (BufferedReader readFile = new BufferedReader(new FileReader(pathToFile))) {
            Validator validator = new Validator();
            String time;
            while ((time = readFile.readLine()) != null) {
                boolean resultCheck = validator.checkStringOnValidity(time);
                if (resultCheck) {
                    String[] stringValid = time.split(" ");
                    for (int i = 0; i < stringValid.length; i++) {
                        doublesFromFile.add(Double.valueOf(stringValid[i].trim()));
                    }
                }
            }
        } catch (IOException e) {
            throw new FileEmptyException("You are trying to verify an empty file!");
        }
        return doublesFromFile;
    }
}
