package assignment1;

import java.util.Arrays;
import java.util.Collections;

import java.util.Random;


/**
 * A utility class for generating random arrays of different types.
 *
 * @param <T> the type of elements in the arrays, must implement Comparable
 */
public class RandomArrayGenerator<T extends Comparable<T>> {

    private Random random = new Random();
    private final Class<T> type;

    /**
     * Constructs a RandomArrayGenerator with the specified type.
     *
     * @param type the type of elements in the arrays
     */
    public RandomArrayGenerator(Class<T> type) {
        this.type = type;
    }

    /**
     * Generates an array of the specified size with random values.
     *
     * @param size the size of the array
     * @return an array of random values
     */
    public T[] generateArray(int size) {
        T[] array = (T[]) java.lang.reflect.Array.newInstance(type, size);

        if (type == Integer.class) {
            Random random = new Random();

            for (int i = 0; i < size; i++) {
                if (i > 0 && random.nextDouble() < 0.2) {
                    // Introduce some repeated values
                    array[i] = array[random.nextInt(i)];
                } else {
                    array[i] = type.cast(i);
                }
                // Ensure the array is sorted up to the current index
//                Arrays.sort(array, 0, i + 1);
            }
        } else if (type == Double.class) {
            Random random = new Random();

            for (int i = 0; i < size; i++) {
                if (i > 0 && random.nextDouble() < 0.2) {
                    // Introduce some repeated values
                    array[i] = array[random.nextInt(i)];
                } else {
                    array[i] = type.cast(i + 0.5);
                }

                // Ensure the array is sorted up to the current index
                Arrays.sort(array, 0, i + 1);
            }
        } else if (type == String.class) {
            for (int i = 0; i < size; i++) {
                int n = random.nextInt(1, 10);
                array[i] = type.cast(generateSortedStringChars(n));
            }
            Arrays.sort(array);
        } else {
            System.out.println("Not supported data type YET!");
        }

        return array;
    }


    /**
     * Create a random string.
     *
     * @param length of the string
     * @return the string created
     */
    private String generateSortedString(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append("A");
        }
        return sb.toString();
    }


    /**
     * Create a random string with sorted characters.
     *
     * @param length of the string
     * @return the string created
     */
    private String generateSortedStringChars(int length) {
        char[] chars = new char[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            chars[i] = (char) ('A' + random.nextInt(26));
        }
        return new String(chars);
    }


    /**
     * Reverses the order of elements in the given array.
     *
     * @param array the array to reverse
     * @param <T>   the type of elements in the array
     * @return the reversed array
     */
    public static <T> T[] reverseArray(T[] array) {
        T[] resultArray = Arrays.copyOf(array, array.length);
        Collections.reverse(Arrays.asList(resultArray));
        return resultArray;
    }

    /**
     * Shuffles the first portion of the array based on the specified level.
     *
     * @param array the array to shuffle
     * @param level the shuffling level (percentage of array to shuffle)
     * @param <T>   the type of elements in the array
     * @return the shuffled array
     */
    public static <T> T[] shuffleArray(T[] array, int level) {
        int size = array.length;
        int endIndex = (int) (size * (level / 100.0));

        T[] partArray = Arrays.copyOfRange(array, 0, endIndex);
        Collections.shuffle(Arrays.asList(partArray));

        T[] resultArray = Arrays.copyOf(array, size);
        System.arraycopy(partArray, 0, resultArray, 0, endIndex);
        return resultArray;
    }
}
