package by.epam.arrays.sorter;

public class ArraySorter {

    public int[] sortArraysMethodBubbles(int[] needSortArray) {
        for (int out = needSortArray.length-1; out >0; out--) {
            for (int in = 0; in < out; in++) {
                if (needSortArray[in] > needSortArray[in+1]) {
                    swapElementsArrays(needSortArray, in,in+1);
                }
            }
        }
        return needSortArray;
    }

    public int[] sortArraysMethodSelection(int[] needSortArray) {
        int min;
        int tmp;
        for (int out = 0; out < needSortArray.length-1; out++){
            min = out;
            for (int in = out+1; in < needSortArray.length; in++){
                if (needSortArray[in] < needSortArray[min])
                    min = in;
            }
            swapElementsArrays(needSortArray, min, out);
        }
        return needSortArray;
    }

    public int[] sortArraysMethodInsertion(int[] needSortArray)
   {
        for (int i = 1; i < needSortArray.length; i++) {
            int current = needSortArray[i];
            int j = i - 1;
            while(j >= 0 && current < needSortArray[j]) {
                needSortArray[j+1] = needSortArray[j];
                j--;
            }
          needSortArray[j+1] = current;
        }
        return needSortArray;
    }

    private void swapElementsArrays(int[] array, int moveForward, int moveBack) {
        int tmp = array[moveForward];
        array[moveForward] = array[moveBack];
        array[moveBack] = tmp;
    }
}
