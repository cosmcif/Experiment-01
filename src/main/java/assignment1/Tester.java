package assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {

    private long[] paramsSize = Tester.setSizeParam();

    public static void main(String[] args) {


        int[] sizeParam = {5,10,15,20,30,50,60,75,90,100,200,500,800,1000,1200,1500,2000,3000,4000,5000,7500,10000,12500,15000,17500,20000,25000,30000,35000,40000,45000,50000,60000,75000,90000,100000};

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
