package assignment1;

/**
 * Main class for assignment 1
 */
public class Main {
    public static void main(String[] args) {

        // Warm up the JVM to avoid timing the JVM warmup phase
        WarmUp.warmUp();
        ResultStorer.printCSVHeader();
        // test the integer array with different algorithms
        TesterInteger testerInteger = new TesterInteger();
        testerInteger.setupInteger();

        // Warm up the JVM to avoid timing the JVM warmup phase
        WarmUp.warmUp();
        // test the double array with different algorithms
        TesterDouble testerDouble = new TesterDouble();
        testerDouble.setupDouble();

        // Warm up the JVM to avoid timing the JVM warmup phase
        WarmUp.warmUp();
        // test the string array with different algorithms
        TesterString testerString = new TesterString();
        testerString.setupString();
    }
}
