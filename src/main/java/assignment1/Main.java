package assignment1;

public class Main {
    public static void main(String[] args) {
        ResultStorer.printCSVHeader();
        TesterInteger testerInteger = new TesterInteger();
        testerInteger.setupInteger(); // returns 200 tests for each algorithm, total 600 tests
        TesterDouble testerDouble = new TesterDouble();
        testerDouble.setupDouble(); // returns 200 tests for each algorithm, total 600 tests
        TesterString testerString = new TesterString();
        testerString.setupString(); // returns 200 tests for each algorithm, total 600 tests

        // returns a total of 1800 tests
    }
}
