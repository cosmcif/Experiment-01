package assignment1;

import java.util.Arrays;
import java.util.Random;

public class WarmUp {

    public static void warmUp() {
        warmUpInteger();
        warmUpDouble();
        warmUpString();
    }

    private static void warmUpInteger() {
        RandomArrayGenerator<Integer> integerGenerator = new RandomArrayGenerator<>(Integer.class);
        Sorter<Integer> sorter1 = new BubbleSortPassPerItem<>();
        Sorter<Integer> sorter2 = new BubbleSortUntilNoChange<>();
        Sorter<Integer> sorter3 = new BubbleSortWhileNeeded<>();
        Sorter<Integer>[] sorters = new Sorter[]{sorter1, sorter2, sorter3};

        warmUp(sorters, integerGenerator);
    }

    private static void warmUpDouble() {
        RandomArrayGenerator<Double> doubleGenerator = new RandomArrayGenerator<>(Double.class);
        Sorter<Double> sorter1 = new BubbleSortPassPerItem<>();
        Sorter<Double> sorter2 = new BubbleSortUntilNoChange<>();
        Sorter<Double> sorter3 = new BubbleSortWhileNeeded<>();
        Sorter<Double>[] sorters = new Sorter[]{sorter1, sorter2, sorter3};

        warmUp(sorters, doubleGenerator);
    }

    private static void warmUpString() {
        RandomArrayGenerator<String> stringGenerator = new RandomArrayGenerator<>(String.class);
        Sorter<String> sorter1 = new BubbleSortPassPerItem<>();
        Sorter<String> sorter2 = new BubbleSortUntilNoChange<>();
        Sorter<String> sorter3 = new BubbleSortWhileNeeded<>();
        Sorter<String>[] sorters = new Sorter[]{sorter1, sorter2, sorter3};

        warmUp(sorters, stringGenerator);
    }

    private static <T extends Comparable<T>> void warmUp(Sorter<T>[] sorters, RandomArrayGenerator<T> generator) {
        for (Sorter<T> sorter : sorters) {
            for (int i = 10; i <= 100; i += 10) {
                T[] array = generator.generateArray(i);
                sorter.sort(Arrays.copyOf(array, array.length));
            }
        }
    }
}
