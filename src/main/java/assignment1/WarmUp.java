package assignment1;

import java.util.Arrays;
import java.util.Random;

/**
 * Warm up the sorter by sorting arrays of different sizes and types before the actual test
 */
public class WarmUp {

    /**
     * Warm up the sorter by sorting arrays of different sizes and types before the actual test
     */
    public static void  warmUp() {
        warmUpInteger();
        warmUpDouble();
        warmUpString();
    }

    /**
     * Warm up the sorter by sorting arrays of different sizes and types before the actual test
     * for Integer type
     */
    private static void warmUpInteger() {
        RandomArrayGenerator<Integer> integerGenerator = new RandomArrayGenerator<>(Integer.class);
        Sorter<Integer> sorter1 = new BubbleSortPassPerItem<>();
        Sorter<Integer> sorter2 = new BubbleSortUntilNoChange<>();
        Sorter<Integer> sorter3 = new BubbleSortWhileNeeded<>();
        Sorter<Integer>[] sorters = new Sorter[]{sorter1, sorter2, sorter3};

        warmUp(sorters, integerGenerator);
    }

    /**
     * Warm up the sorter by sorting arrays of different sizes and types before the actual test
     * for Double type
     */
    private static void warmUpDouble() {
        RandomArrayGenerator<Double> doubleGenerator = new RandomArrayGenerator<>(Double.class);
        Sorter<Double> sorter1 = new BubbleSortPassPerItem<>();
        Sorter<Double> sorter2 = new BubbleSortUntilNoChange<>();
        Sorter<Double> sorter3 = new BubbleSortWhileNeeded<>();
        Sorter<Double>[] sorters = new Sorter[]{sorter1, sorter2, sorter3};

        warmUp(sorters, doubleGenerator);
    }

    /**
     * Warm up the sorter by sorting arrays of different sizes and types before the actual test
     * for String type
     */
    private static void warmUpString() {
        RandomArrayGenerator<String> stringGenerator = new RandomArrayGenerator<>(String.class);
        Sorter<String> sorter1 = new BubbleSortPassPerItem<>();
        Sorter<String> sorter2 = new BubbleSortUntilNoChange<>();
        Sorter<String> sorter3 = new BubbleSortWhileNeeded<>();
        Sorter<String>[] sorters = new Sorter[]{sorter1, sorter2, sorter3};

        warmUp(sorters, stringGenerator);
    }

    /**
     * Warm up the sorter by sorting arrays of different sizes and types before the actual test
     * @param sorters the sorters to be warmed up with different arrays
     * @param generator the generator to generate different arrays for warming up
     * @param <T> the type of the array
     */
    private static <T extends Comparable<T>> void warmUp(Sorter<T>[] sorters, RandomArrayGenerator<T> generator) {
        for (Sorter<T> sorter : sorters) {
            for (int i = 10; i <= 100; i += 10) {
                T[] array = generator.generateArray(i);
                sorter.sort(Arrays.copyOf(array, array.length));
            }
        }
    }
}
