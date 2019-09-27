package by.epam.arrays.reader;

import by.epam.arrays.validator.Validator;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReaderFromFile {
    public List<Double> doublesFromFile = new ArrayList<>();

    public List<Double> readFromFileAndValidation(String pathToFile) {
        try (BufferedReader readFile = new BufferedReader(new FileReader(pathToFile))) {
            Validator validator = new Validator();
            String time;
            while ((time = readFile.readLine()) != null) {
                String[] resultCheck = validator.checkFileOnValidity(time);
                if (resultCheck != null) {
                    for (int i = 0; i <resultCheck.length ; i++) {
                        doublesFromFile.add(Double.valueOf(resultCheck[i]));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doublesFromFile;
    }
}
