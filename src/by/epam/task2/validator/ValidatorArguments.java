package by.epam.task2.validator;

import by.epam.task2.exception.ValidationException;

import java.io.IOException;

public class ValidatorArguments {

    public byte checkString(String string) {
        String patternCarriage = "^(SEAT|COMMON|ECONOM|COUPE|SV)(\\s)+\\d+(\\s)+\\d+$";
        String patternLocomotive = "^(DIESEL|ELECTRIC)(\\s)+\\d+$";
        String time = string.toUpperCase().trim();
        if(time.matches(patternCarriage)){
            return 0;
        } else if(time.matches(patternLocomotive)){
            return 1;
        } else {throw new ValidationException("String isn't valid!");}
    }
}
