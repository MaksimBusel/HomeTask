package by.epam.arrays.creator;

import java.util.Random;

public class ArrayCreator {

    public int[] createArrayNeedSize(int sizeArray) {
        int[] arrayOrdinarNumbers = new int[sizeArray];
        for (int i = 0; i < arrayOrdinarNumbers.length; i++) {
            arrayOrdinarNumbers[i] = i;
        }
        return arrayOrdinarNumbers;
    }

    public int[] createArrayRandomNumber(int sizeArray) {
        Random generateRandomNumbers = new Random();
        int[] arrayRandomNumbers = new int[sizeArray];
        for (int i = 0; i < arrayRandomNumbers.length; i++) {
            arrayRandomNumbers[i] = generateRandomNumbers.nextInt(1000);
        }
        return arrayRandomNumbers;
    }
}
