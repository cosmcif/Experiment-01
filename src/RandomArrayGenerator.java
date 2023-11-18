import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class RandomArrayGenerator<T extends Comparable<T>> {

    private Class<T> type;

    public RandomArrayGenerator(Class<T> type) {
        this.type = type;
    }

    public T[] generateArray(int size) {
        T[] array = (T[]) java.lang.reflect.Array.newInstance(type, size);



        if (type == Integer.class) {
            for (int i=0; i< size; i++) {
                array[i] = type.cast(i);
            }
        }
        else if (type == Double.class) {
            for (int i = 0; i < size; i++ ) {
                array[i] = type.cast(i + 0.5);
            }
        }
        else {
            System.out.println("Not supported data type YET!");
        }

        return array;
    }


    public static <T> T[] reverseArray(T[] array) {
        Collections.reverse(Arrays.asList(array));
        return array;
    }

    public static <T>  T[] shuffleArray(T[] array, int level) {
        int size = array.length;
        int endIndex = (int) (size * (level / 100.0));

        T[] partArray = Arrays.copyOfRange(array, 0, endIndex);
        Collections.shuffle(Arrays.asList(partArray));

        System.arraycopy(partArray, 0, array, 0, endIndex);
        return array;
    }
    


    // private T[] generateValue(int size) {
    //     if (type == Integer.class) {
    //         return type.cast();
    //     } else if (type == Double.class) {
    //         return type.cast(random.nextDouble());
    //     }
    //     //  else if (type == String.class) {
    //     //     return type.cast(generateRandomString(100));
    //     // } else if (type == Character.class) {
    //     //     String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    //     //     int index = random.nextInt(characters.length());
    //     //     return type.cast(characters.charAt(index));
    //     // }
    //      else {
    //         System.out.println("Not a supported data type.");
    //         return type.cast(0);
    //     }
    // }

    // /**
    //  * Generates a random array of chars within a specified range of length.
    //  *
    //  * @param length The size of the array.
    //  * @return An array of length {@code length} composed of random characters within the length of range [0,
    //  *         {@code length}).
    //  */
    // private static String generateRandomString(int length) {
    //     String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    //     StringBuilder sb = new StringBuilder(length);
    //     Random random = new Random();

    //     for (int i = 0; i < length; i++) {
    //         int index = random.nextInt(characters.length());
    //         sb.append(characters.charAt(index));
    //     }

    //     return sb.toString();
    // }


}
