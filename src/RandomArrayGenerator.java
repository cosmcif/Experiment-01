import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class RandomArrayGenerator<T extends Comparable<T>> {

    private final Class<T> type;

    public RandomArrayGenerator(Class<T> type) {
        this.type = type;
    }

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
        } else {
            System.out.println("Not supported data type YET!");
        }

        return array;
    }

    public static <T> T[] reverseArray(T[] array) {
        Collections.reverse(Arrays.asList(array));
        return array;
    }

    public static <T> T[] shuffleArray(T[] array, int level) {
        int size = array.length;
        int endIndex = (int) (size * (level / 100.0));

        T[] partArray = Arrays.copyOfRange(array, 0, endIndex);
        Collections.shuffle(Arrays.asList(partArray));

        System.arraycopy(partArray, 0, array, 0, endIndex);
        return array;
    }
}
