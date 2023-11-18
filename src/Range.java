import java.util.Random;

/**
 * Represents a numeric range with a start and end value (inclusive).
 */
public class Range {

    private final int start;
    private final int end;

    /**
     * Constructs a range with the specified start and end values.
     *
     * @param start the start value of the range (inclusive)
     * @param end   the end value of the range (inclusive)
     * @throws IllegalArgumentException if start is greater than end
     */
    public Range(int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException("Start value must be less than or equal to end value.");
        }
        this.start = start;
        this.end = end;
    }

    /**
     * Gets the start value of the range.
     *
     * @return the start value
     */
    public int getStart() {
        return start;
    }

    /**
     * Gets the end value of the range.
     *
     * @return the end value
     */
    public int getEnd() {
        return end;
    }

    /**
     * Generates a random number within the range (inclusive).
     *
     * @return a random number within the range
     */
    public int randomNumberInRange() {
        Random random = new Random();
        return random.nextInt(end - start + 1) + start;
    }
}
