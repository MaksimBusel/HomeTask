package by.epam.task1.arrays.sorter;

public class ArraySorter {

    public int[] bubbleSort(int[] array) {
        for (int out = array.length-1; out >0; out--) {
            for (int in = 0; in < out; in++) {
                if (array[in] > array[in+1]) {
                    swapElementsArrays(array, in,in+1);
                }
            }
        }
        return array;
    }

    public int[] selectionSort(int[] array) {
        int min;
        int temp;
        for (int out = 0; out < array.length-1; out++){
            min = out;
            for (int in = out+1; in < array.length; in++){
                if (array[in] < array[min])
                    min = in;
            }
            swapElementsArrays(array, min, out);
        }
        return array;
    }

    public int[] insertionSort(int[] array)
   {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
          array[j+1] = current;
        }
        return array;
    }

    private void swapElementsArrays(int[] array, int moveForward, int moveBack) {
        int tmp = array[moveForward];
        array[moveForward] = array[moveBack];
        array[moveBack] = tmp;
    }
}
