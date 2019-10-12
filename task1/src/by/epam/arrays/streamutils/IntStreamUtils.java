package by.epam.arrays.streamutils;

import java.util.stream.IntStream;
import java.util.stream.LongStream;


public class IntStreamUtils {

    public int findMin(int... arrayInt){
        IntStream intStream = IntStream.of(arrayInt);
        LongStream continueIntStream = intStream.mapToLong(x ->x);
        return (int)continueIntStream.summaryStatistics().getMin();
    }
    public int findMax(int... arrayInt){
        IntStream intStream = IntStream.of(arrayInt);
        LongStream continueIntStream = intStream.mapToLong(x ->x);
        return (int)continueIntStream.summaryStatistics().getMax();
    }
    public int findAverage(int... arrayInt){
        IntStream intStream = IntStream.of(arrayInt);
        LongStream continueIntStream = intStream.mapToLong(x ->x);
        return (int)continueIntStream.summaryStatistics().getAverage();
    }
    public int findSum(int... arrayInt){
        return IntStream.of(arrayInt).sum();
    }
    public int[] sortArrayInt(int... arrayInt){
        return IntStream.of(arrayInt).sorted().toArray();
    }
}
