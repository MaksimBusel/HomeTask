package by.epam.task1.arrays.utils;

public class UtilsForArray {

    public int findMin(int [] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min>array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public int findMax(int [] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public int calculateSum(int [] array) {
        int sum=0;
        for (int i = 0; i <array.length ; i++) {
            sum+=array[i];
        }
        return sum;
    }
}
