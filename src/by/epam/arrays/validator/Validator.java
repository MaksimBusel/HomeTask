package by.epam.arrays.validator;


public class Validator {

    public String[] checkFileOnValidity(String stringForCheck) {
        String[] arrayForCheck = stringForCheck.split(" ");
        for (int i = 0; i < arrayForCheck.length; i++) {
            if (!(arrayForCheck[i].matches("^\\d+(\\.\\d+)|\\d+|[+-]\\d+(\\.\\d+)|[+-]\\d+$"))) {
                return null;
            }
        }
        return arrayForCheck;
    }
}



