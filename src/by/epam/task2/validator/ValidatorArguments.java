package by.epam.task2.validator;

import by.epam.task2.exception.ValidationException;

import java.io.IOException;

public class ValidatorArguments {

    public byte checkString(String string) {
        String patternCarriage = "^(SEAT|COMMON|ECONOM|COUPE|SV)\\s*\\:\\s*\\d+\\s*\\:\\s*\\d+$";
        String patternLocomotive = "^(DIESEL|ELECTRIC)\\s*\\:\\s*\\d+$";
        String time = string.toUpperCase().trim();
        if(time.matches(patternCarriage)){
            return 0;
        } else if(time.matches(patternLocomotive)){
            return 1;
        } else { return 2;/*throw new ValidationException("String isn't valid!");*/}
    }
}
