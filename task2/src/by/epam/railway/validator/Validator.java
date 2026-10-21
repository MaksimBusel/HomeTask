package by.epam.railway.validator;

public class Validator {

    public boolean validate(String string) {
        if (string == null || string.isBlank()) {
            return false;
        }
        String patternCarriage = "^CARRIAGE\\s*\\:\\s*(SEAT|COMMON|ECONOM|COUPE|SV)\\s*\\:\\s*\\d+\\s*\\:\\s*\\d+$";
        String patternLocomotive = "^LOCOMOTIVE\\s*\\:\\s*(DIESEL|ELECTRIC)\\s*\\:\\s*\\d+$";
        String normalizedLine = string.toUpperCase().trim();
        return normalizedLine.matches(patternCarriage) || normalizedLine.matches(patternLocomotive);
    }
}

