import java.util.Random;
/**
 * Class for generate arrays of different:
 *  - Types
 *  - Length
 */
public class RandomArrayGenerator {


    /**
     * Generates a random array of integers within a specified range.
     * 
     * @param size   The size of the array.
     * @param range  The upper exclusive bound of the range for random integers.
     * @return       An array of length {@code size} composed of random integers within the range [0, {@code range}).
     */
    public static Integer[] generateRandomIntArray(int size, int range) {
        Integer[] array = new Integer[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(range);
        }

        return array;
    }


    /**
     * Generates a random array of Double within a specified range.
     * 
     * @param size   The size of the array.
     * @param range  The upper exclusive bound of the range for random Double.
     * @return       An array of length {@code size} composed of random Double within the range [0.0, {@code range}).
     */
    public static Double[] generateRandomDoubleArray(int size, double range) {
        Double[] array = new Double[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextDouble() * range;
        }

        return array;
    }

    /**
     * Generates a random array of random Strings within a specified string Length.
     * 
     * @param size   The size of the array.
     * @param stringLength  The upper exclusive bound of the range for random Strings length.
     * @return       An array of length {@code size} composed of random Strings within the length of range [0, {@code stringLength}).
     */
    public static String[] generateRandomStringArray(int size, int stringLength) {
        String[] array = new String[size];

        for (int i = 0; i < size; i++) {
            array[i] = generateRandomString(stringLength);
        }

        return array;
    }

    /**
     * Generates a random array of chars within a specified range of length.
     * 
     * @param length   The size of the array.
     * @return       An array of length {@code length} composed of random characters within the length of range [0, {@code length}).
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


    /**
     * Generates a random array of Booleans within a specified range of size.
     * 
     * @param size   The size of the array.
     * @return       An array of length {@code size} composed of random Boolean values within the length of range [0, {@code size}).
     */
    public static Boolean[] generateRandomBooleanArray(int size) {
        Boolean[] array = new Boolean[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextBoolean();
        }

        return array;
    }
}
