package by.epam.arrays.validator;


public class Validator {

    public boolean checkStringOnValidity(String string) {
        return (string.matches("^([+-]?\\d+(\\.\\d+)?(\\s?)*)+$"));
    }
}



