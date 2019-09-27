package by.epam.arrays.streamutils;

import java.util.stream.IntStream;

public class IntStreamUtilsInOneString {
    public int findMinNumber(int[] arrayInt){
        return (int) IntStream.of(arrayInt).mapToLong(x -> x).summaryStatistics().getMin();
    }
    public int findMaxNumber(int[] arrayInt){
        return (int) IntStream.of(arrayInt).mapToLong(x ->x).summaryStatistics().getMax();
    }
    public int findAverageNumbers(int[] arrayInt){
        return (int) IntStream.of(arrayInt).mapToLong(x ->x).summaryStatistics().getAverage();
    }
    public int findSumNumbers(int[] arrayInt){
        return IntStream.of(arrayInt).sum();
    }
    public int[] sortArrayInt(int[] arrayInt){
        return IntStream.of(arrayInt).sorted().toArray();
    }
}
