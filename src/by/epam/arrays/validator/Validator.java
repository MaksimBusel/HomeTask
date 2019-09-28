package by.epam.arrays.validator;


public class Validator {

    public boolean checkStringOnValidity(String string) {
        String[] arrayForCheck = string.split(" ");
        for (int i = 0; i < arrayForCheck.length; i++) {
            if (!(arrayForCheck[i].matches("^[+-]?\\d+(\\.\\d+)?$"))) {
                return false;
            }
        }
        return true;
    }
}



