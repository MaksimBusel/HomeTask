package by.epam.task2.validator;

import by.epam.task2.exception.ValidationException;
import org.apache.log4j.Logger;

public class ValidatorArguments {
    private Logger log = Logger.getLogger(ValidatorArguments.class);

    public byte checkString(String string) {   //byte т.к. сообщает для какого обьекта находятся параметры в строке
        String patternCarriage = "^(SEAT|COMMON|ECONOM|COUPE|SV)\\s*\\:\\s*\\d+\\s*\\:\\s*\\d+$";
        String patternLocomotive = "^(DIESEL|ELECTRIC)\\s*\\:\\s*\\d+$";
        String time = string.toUpperCase().trim();
        log.info("Check the parameters to create carriage or locomotive");
        if(time.matches(patternCarriage)){
            return 0;                          //параметры для создания вагона
        } else if(time.matches(patternLocomotive)){
            return 1;                         //параметры для создания локомотива
        } else { throw new ValidationException();}
    }
}
