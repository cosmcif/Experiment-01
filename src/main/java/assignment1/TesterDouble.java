package assignment1;

import java.util.ArrayList;
import java.util.Arrays;

public class TesterDouble {
    static Sorter<Double> sorter1 = new BubbleSortPassPerItem<>();
    static Sorter<Double> sorter2 = new BubbleSortUntilNoChange<>();
    static Sorter<Double> sorter3 = new BubbleSortWhileNeeded<>();

    static ArrayList<Sorter<Double>> sorters = new ArrayList<>(Arrays.asList(sorter1, sorter2, sorter3));
    static RandomArrayGenerator<Double> doubleGenerator = new RandomArrayGenerator<>(Double.class);
    static Range range1 = new Range(10, 100);
    static Range range2 = new Range(101, 1000);
    static Range range3 = new Range(1001, 10000);
    static Range range4 = new Range(10001, 50000);
    static Range range5 = new Range(50001, 100000);
    static ArrayList<Range> ranges = new ArrayList<>(Arrays.asList(range1, range2, range3, range4, range5));

    public void setupDouble() {
        ResultStorer.printCSVHeader();
        int arrayLength = 5;

        for (Range range : ranges) { // 5 ranges
            int[] sizes = new int[arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                sizes[i] = range.randomNumberInRange(); //create random lengths
            }
            for (int length : sizes) {
                Double[] doubleArray = doubleGenerator.generateArray(length);

                // 12 tests
                runTestInt(RandomArrayGenerator.reverseArray(doubleArray), 100);
                runTestInt(RandomArrayGenerator.shuffleArray(doubleArray, 25), 25);
                runTestInt(RandomArrayGenerator.shuffleArray(doubleArray, 50), 50);
                runTestInt(RandomArrayGenerator.shuffleArray(doubleArray, 75), 75);
            }
        }
    }

    public void runTestInt(Double[] array, int shuffleLevel) {
        for (Sorter sorter : sorters) {
            Double[] arrayCopy = Arrays.copyOf(array, array.length);
            long startTime = System.nanoTime();
            sorter.sort(arrayCopy);
            long endTime = System.nanoTime();
            long timeTaken = endTime - startTime;
            boolean isInverseSorted = shuffleLevel == 100;
            ResultStorer resultStorer = new ResultStorer(sorter.toString(), array.length, "Double", shuffleLevel, isInverseSorted, timeTaken);
            resultStorer.printCSV();
        }
    }

}
