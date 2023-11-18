import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {


    public static void main(String[] args) {

        RandomArrayGenerator<Integer> integerGenerator = new RandomArrayGenerator<>(Integer.class);
        Integer[] integerArray_10 = integerGenerator.generateArray(10);
        System.out.println("sorted int array: " + Arrays.toString(integerArray_10));
        System.out.println("shuffle int array "+ Arrays.toString(RandomArrayGenerator.shuffleArray(integerArray_10, 50)));
        System.out.println("reversed int array "+ Arrays.toString(RandomArrayGenerator.reverseArray(integerArray_10)));

        Sorter<Integer> sorter1 = new BubbleSortPassPerItem<>();
        Sorter<Integer> sorter2 = new BubbleSortUntilNoChange<>();
        Sorter<Integer> sorter3 = new BubbleSortWhileNeeded<>();

    }



    
}
