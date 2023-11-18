import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {

    private long[] paramsSize = Tester.setSizeParam();

    public static void main(String[] args) {

        Integer[] integer_array_10_10 = RandomArrayGenerator.generateRandomIntArray(10, 10);
        System.out.println("not sorted int array: " + Arrays.toString(integer_array_10_10));

        Sorter<Integer> sorter1 = new BubbleSortPassPerItem<>();
        Sorter<Integer> sorter2 = new BubbleSortUntilNoChange<>();
        Sorter<Integer> sorter3 = new BubbleSortWhileNeeded<>();

        sorter1.sort(integer_array_10_10);
        System.out.println("new array:" + Arrays.toString(integer_array_10_10));
    }



    public static long[] setSizeParam() {
            List<Long> numList = new ArrayList<>();
            long size = 2;

            while (size <= Long.MAX_VALUE) {
                numList.add(size);
                size *= size; // Double the size
            }

            return numList.stream().mapToLong(Long::longValue).toArray();
        }
}
