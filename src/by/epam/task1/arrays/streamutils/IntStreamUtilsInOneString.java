package by.epam.task1.arrays.streamutils;

import java.util.stream.IntStream;

public class IntStreamUtilsInOneString {
    public int findMin(int[] arrayInt){
        return (int) IntStream.of(arrayInt).mapToLong(x -> x).summaryStatistics().getMin();
    }
    public int findMax(int[] arrayInt){
        return (int) IntStream.of(arrayInt).mapToLong(x ->x).summaryStatistics().getMax();
    }
    public int findAverage(int[] arrayInt){
        return (int) IntStream.of(arrayInt).mapToLong(x ->x).summaryStatistics().getAverage();
    }
    public int findSum(int[] arrayInt){
        return IntStream.of(arrayInt).sum();
    }
    public int[] sortArrayInt(int[] arrayInt){
        return IntStream.of(arrayInt).sorted().toArray();
    }
}
