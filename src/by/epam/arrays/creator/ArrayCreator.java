package by.epam.arrays.creator;

import by.epam.arrays.exception.ArraySizeException;

import java.util.Random;

public class ArrayCreator {

    public int[] createArray(int size) {
        if (size < 1) {
            throw new ArraySizeException("Incorrect size array. Size array must be more 0. Try again");
        }
        int[] ordinarNumbers = new int[size];
        for (int i = 0; i < ordinarNumbers.length; i++) {
            ordinarNumbers[i] = i;
        }
        return ordinarNumbers;
    }

    public int[] createRandomArray(int size) {
        if (size <1) {
            throw new ArraySizeException("Incorrect size array. Size array must be more 0. Try again");
        }
        Random random = new Random();
        int[] randomNumbers = new int[size];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(1000);
        }
        return randomNumbers;
    }
}
