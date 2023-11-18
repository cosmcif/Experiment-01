import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class RandomArrayGenerator<T extends Comparable<T>> {

    private Class<T> type;

    public RandomArrayGenerator(Class<T> type) {
        this.type = type;
    }

    public T[] generateRandomArray(int size) {
        T[] array = (T[]) java.lang.reflect.Array.newInstance(type, size);
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = generateRandomValue(random);
        }

        return array;
    }


    private T generateRandomValue(Random random) {
        if (type == Integer.class) {
            return type.cast(random.nextInt());
        } else if (type == Double.class) {
            return type.cast(random.nextDouble());
        } else if (type == String.class) {
            return type.cast(generateRandomString(100));
        } else if (type == Character.class) {
            String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
            int index = random.nextInt(characters.length());
            return type.cast(characters.charAt(index));
        } else {
            System.out.println("Not a supported data type.");
            return type.cast(0);
        }
    }

    /**
     * Generates a random array of chars within a specified range of length.
     *
     * @param length The size of the array.
     * @return An array of length {@code length} composed of random characters within the length of range [0,
     *         {@code length}).
     */
    private static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }

    public T[] randomSortLevel(String level, T[] array) {
        Sorter<T> sorter = new BubbleSortPassPerItem<>();

        switch (level) {
            case "firstHalf":
                int firstHalfSize = array.length / 2;
                T[] firstHalf = Arrays.copyOfRange(array, 0, firstHalfSize);
                sorter.sort(firstHalf);
                System.arraycopy(firstHalf, 0, array, 0, firstHalfSize);
                break;

            case "secondHalf":
                int secondHalfStart = array.length / 2;
                T[] secondHalf = Arrays.copyOfRange(array, secondHalfStart, array.length);
                sorter.sort(secondHalf);
                System.arraycopy(secondHalf, 0, array, secondHalfStart, secondHalf.length);
                break;

            case "complete":
                sorter.sort(array);
                break;

            case "desorted":
                Arrays.sort(array, Collections.reverseOrder());
                break;

            default:
                // Handle invalid level
                throw new IllegalArgumentException("Invalid sorting level: " + level);
        }

        return array;
    }
}
