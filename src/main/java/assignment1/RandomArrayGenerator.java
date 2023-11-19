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
            for (int i = 0; i < size; i++) {
                array[i] = type.cast(i);
            }
        } else if (type == Double.class) {
            for (int i = 0; i < size; i++) {
                array[i] = type.cast(i + 0.5);
            }
        } else if (type == String.class) {
            for (int i = 0; i < size; i++) {
                array[i] = type.cast(generateSortedString(i + 1)); // Adjust the length as needed
            }
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
     * Reverses the order of elements in the given array.
     *
     * @param array the array to reverse
     * @param <T>   the type of elements in the array
     * @return the reversed array
     */
    public static <T> T[] reverseArray(T[] array) {
        Collections.reverse(Arrays.asList(array));
        return array;
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

        System.arraycopy(partArray, 0, array, 0, endIndex);
        return array;
    }
}
