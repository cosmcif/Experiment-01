import java.util.Random;

public class Range {
    private final int start;
    private final int end;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public int randomNumberInRange() {
        Random random = new Random();
        return random.nextInt(start, end);
    }
}
