package by.epam.task2.validator;

public class Validator {

    public boolean validate(String string) {
        String patternCarriage = "^CARRIAGE\\s*\\:\\s*(SEAT|COMMON|ECONOM|COUPE|SV)\\s*\\:\\s*\\d+\\s*\\:\\s*\\d+$";
        String patternLocomotive = "^LOCOMOTIVE\\s*\\:\\s*(DIESEL|ELECTRIC)\\s*\\:\\s*\\d+$";
        String time = string.toUpperCase().trim();
        if (time.matches(patternCarriage) || time.matches(patternLocomotive)) {
            return true;
        } else {
            return false;
        }
    }
}

