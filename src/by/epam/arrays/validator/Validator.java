package by.epam.arrays.validator;


public class Validator {

    public boolean checkStringOnValidity(String string) {
        if (string.matches("^([+-]?\\d+(\\.\\d+)?+\\s?)*$")) {
            return true;
        }
        return false;
    }
}



