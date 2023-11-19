package assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Tester {


    public static void main(String[] args) {

        RandomArrayGenerator<Integer> integerGenerator = new RandomArrayGenerator<>(Integer.class);
        Integer[] integerArray_10 = integerGenerator.generateArray(10);
        System.out.println("sorted int array: " + Arrays.toString(integerArray_10));
        System.out.println("shuffle int array "+ Arrays.toString(RandomArrayGenerator.shuffleArray(integerArray_10, 50)));
        System.out.println("reversed int array "+ Arrays.toString(RandomArrayGenerator.reverseArray(integerArray_10)));


        RandomArrayGenerator<String> stringRandomArrayGenerator = new RandomArrayGenerator<>(String.class);
        String[] stringArray = stringRandomArrayGenerator.generateArray(10);
        System.out.println(Arrays.toString(stringArray));
        Sorter<Integer> sorter1 = new BubbleSortPassPerItem<>();
        Sorter<Integer> sorter2 = new BubbleSortUntilNoChange<>();
        Sorter<Integer> sorter3 = new BubbleSortWhileNeeded<>();

    }

    //int[]



    // 10 - 100
    // 101 - 1000
    // 1001 - 10 000
    // 10 001  - 50 000
    // 50 001 - 100 000

    // for each range take m times
    // where m is the 10
}
