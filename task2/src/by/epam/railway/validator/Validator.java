package by.epam.railway.validator;

public class Validator {

    public boolean validate(String string) {
        String patternCarriage = "^CARRIAGE\\s*\\:\\s*(SEAT|COMMON|ECONOM|COUPE|SV)\\s*\\:\\s*\\d+\\s*\\:\\s*\\d+$";
        String patternLocomotive = "^LOCOMOTIVE\\s*\\:\\s*(DIESEL|ELECTRIC)\\s*\\:\\s*\\d+$";
        String time = string.toUpperCase().trim();
        return time.matches(patternCarriage) || time.matches(patternLocomotive);
    }
}

