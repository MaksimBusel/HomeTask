package by.epam.arrays.creator;

import by.epam.arrays.exception.ExceptionSizeArray;

import java.util.Random;

public class ArrayCreator {

    public int[] createArrayNeedSize(int sizeArray) {
        if (sizeArray > 0) {
            int[] arrayOrdinarNumbers = new int[sizeArray];
            for (int i = 0; i < arrayOrdinarNumbers.length; i++) {
                arrayOrdinarNumbers[i] = i;
            }
            return arrayOrdinarNumbers;
        }
        throw new ExceptionSizeArray("Incorrect size array. Size array must be more 0. Try again");
    }

    public int[] createArrayRandomNumber(int sizeArray) {
        if (sizeArray > 0) {
            Random generateRandomNumbers = new Random();
            int[] arrayRandomNumbers = new int[sizeArray];
            for (int i = 0; i < arrayRandomNumbers.length; i++) {
                arrayRandomNumbers[i] = generateRandomNumbers.nextInt(1000);
            }
            return arrayRandomNumbers;
        }
        throw new ExceptionSizeArray("Incorrect size array. Size array must be more 0. Try again");
    }
}
