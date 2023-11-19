package assignment1;

import java.util.ArrayList;
import java.util.Arrays;

public class TesterInteger {
    static Sorter<Integer> sorter1 = new BubbleSortPassPerItem<>();
    static Sorter<Integer> sorter2 = new BubbleSortUntilNoChange<>();
    static Sorter<Integer> sorter3 = new BubbleSortWhileNeeded<>();

    static ArrayList<Sorter<Integer>> sorters = new ArrayList<>(Arrays.asList(sorter1, sorter2, sorter3));
    static RandomArrayGenerator<Integer> integerGenerator = new RandomArrayGenerator<>(Integer.class);
    static Range range1 = new Range(10, 100);
    static Range range2 = new Range(101, 1000);
    static Range range3 = new Range(1001, 10000);
    static Range range4 = new Range(10001, 50000);
    static Range range5 = new Range(50001, 100000);
    static ArrayList<Range> ranges = new ArrayList<>(Arrays.asList(range1, range2, range3, range4, range5));

    public void setupInteger() {
        int arrayLength = 31;

        for (Range range : ranges) { // 5 ranges
            int[] sizes = new int[arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                sizes[i] = range.randomNumberInRange(); //create random lengths
            }
            for (int length : sizes) {
                Integer[] integerArray = integerGenerator.generateArray(length);
                //Integer[] integerArrayReversed = RandomArrayGenerator.reverseArray(integerArray);
                //Integer[] integerArrayShuffled = RandomArrayGenerator.shuffleArray(integerArray, 50);

                // 12 tests
                runTestInt(RandomArrayGenerator.reverseArray(integerArray), 100);
                runTestInt(RandomArrayGenerator.shuffleArray(integerArray, 25), 25);
                runTestInt(RandomArrayGenerator.shuffleArray(integerArray, 50), 50);
                runTestInt(RandomArrayGenerator.shuffleArray(integerArray, 75), 75);
            }
        }
    }

    public void runTestInt(Integer[] array, int shuffleLevel) {
        for (Sorter sorter : sorters) {
            Integer[] arrayCopy = Arrays.copyOf(array, array.length);
            long startTime = System.nanoTime();
            sorter.sort(arrayCopy);
            long endTime = System.nanoTime();
            long timeTaken = endTime - startTime;
            boolean isInverseSorted = shuffleLevel == 100;
            ResultStorer resultStorer = new ResultStorer(sorter.toString(), array.length, "Integer", shuffleLevel, isInverseSorted, timeTaken);
            resultStorer.printCSV();
        }
    }

}
