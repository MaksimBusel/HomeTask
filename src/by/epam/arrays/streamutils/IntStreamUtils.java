package by.epam.arrays.streamutils;

import java.util.stream.IntStream;
import java.util.stream.LongStream;


public class IntStreamUtils {

    public int findMinNumber(int... arrayInt){
        IntStream intStream = IntStream.of(arrayInt);
        LongStream continueIntStream = intStream.mapToLong(x ->x);
        return (int)continueIntStream.summaryStatistics().getMin();
    }
    public int findMaxNumber(int... arrayInt){
        IntStream intStream = IntStream.of(arrayInt);
        LongStream continueIntStream = intStream.mapToLong(x ->x);
        return (int)continueIntStream.summaryStatistics().getMax();
    }
    public int findAverageNumbers(int... arrayInt){
        IntStream intStream = IntStream.of(arrayInt);
        LongStream continueIntStream = intStream.mapToLong(x ->x);
        return (int)continueIntStream.summaryStatistics().getAverage();
    }
    public int findSumNumbers(int... arrayInt){
        return IntStream.of(arrayInt).sum();
    }
    public int[] sortArrayInt(int... arrayInt){
        IntStream intStream = IntStream.of(arrayInt).sorted();
        return intStream.toArray();
    }
}
