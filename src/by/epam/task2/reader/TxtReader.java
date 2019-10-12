package by.epam.task2.reader;

import org.apache.log4j.Logger;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TxtReader {
    private static final Logger log = Logger.getLogger(TxtReader.class);

    public List<String> read(String pathToFile) {
        List<String> parametersFromFiles = new ArrayList<>();
        try (BufferedReader readTxt = new BufferedReader(new FileReader(pathToFile))) {
            String time;
            while ((time = readTxt.readLine()) != null) {
                parametersFromFiles.add(time);
            }
        } catch (IOException e) {
            log.error("Error reading file", e);
        }
        return parametersFromFiles;
    }
}
