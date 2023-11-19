package assignment1;

import java.util.ArrayList;
import java.util.Arrays;

public class TesterString {
    static Sorter<String> sorter1 = new BubbleSortPassPerItem<>();
    static Sorter<String> sorter2 = new BubbleSortUntilNoChange<>();
    static Sorter<String> sorter3 = new BubbleSortWhileNeeded<>();

    static ArrayList<Sorter<String>> sorters = new ArrayList<>(Arrays.asList(sorter1, sorter2, sorter3));
    static RandomArrayGenerator<String> StringGenerator = new RandomArrayGenerator<>(String.class);
    static Range range1 = new Range(10, 100);
    static Range range2 = new Range(101, 1000);
    static Range range3 = new Range(1001, 10000);
    static Range range4 = new Range(10001, 50000);
    static Range range5 = new Range(50001, 100000);
    static ArrayList<Range> ranges = new ArrayList<>(Arrays.asList(range1, range2, range3, range4, range5));

    public void setupString() {
        int arrayLength = 31;

        for (Range range : ranges) { // 5 ranges
            int[] sizes = new int[arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                sizes[i] = range.randomNumberInRange(); //create random lengths
            }
            for (int length : sizes) {
                String[] StringArray = StringGenerator.generateArray(length);
                //String[] StringArrayReversed = RandomArrayGenerator.reverseArray(StringArray);
                //String[] StringArrayShuffled = RandomArrayGenerator.shuffleArray(StringArray, 50);

                // 12 tests
                runTestInt(RandomArrayGenerator.reverseArray(StringArray), 100);
                runTestInt(RandomArrayGenerator.shuffleArray(StringArray, 25), 25);
                runTestInt(RandomArrayGenerator.shuffleArray(StringArray, 50), 50);
                runTestInt(RandomArrayGenerator.shuffleArray(StringArray, 75), 75);
            }
        }
    }

    public void runTestInt(String[] array, int shuffleLevel) {
        for (Sorter sorter : sorters) {
            String[] arrayCopy = Arrays.copyOf(array, array.length);
            long startTime = System.nanoTime();
            sorter.sort(arrayCopy);
            long endTime = System.nanoTime();
            long timeTaken = endTime - startTime;
            boolean isInverseSorted = shuffleLevel == 100;
            ResultStorer resultStorer = new ResultStorer(sorter.toString(), array.length, "String", shuffleLevel, isInverseSorted, timeTaken);
            resultStorer.printCSV();
        }
    }

}
