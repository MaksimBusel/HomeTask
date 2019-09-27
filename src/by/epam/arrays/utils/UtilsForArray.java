package by.epam.arrays.utils;

public class UtilsForArray {

    public int findMinNumberInArray(int [] someArray) {
        int minNumber = someArray[0];
        for (int i = 1; i < someArray.length; i++) {
            if (minNumber>someArray[i]) {
                minNumber = someArray[i];
            }
        }
        return minNumber;
    }

    public int findMaxNumberInArray(int [] someArray) {
        int maxNumber = someArray[0];
        for (int i = 1; i < someArray.length; i++) {
            if (maxNumber < someArray[i]) {
                maxNumber = someArray[i];
            }
        }
        return maxNumber;
    }

    public int calculateSumNumbersArray(int [] someArray) {
        int sumNumbers=0;
        for (int i = 0; i <someArray.length ; i++) {
            sumNumbers+=someArray[i];
        }
        return sumNumbers;
    }
}
