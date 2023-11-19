package assignment1;

public class Main {
    public static void main(String[] args) {
        ResultStorer.printCSVHeader();
        TesterInteger testerInteger = new TesterInteger();
        testerInteger.setupInteger(); // returns 100 tests for each algorithm, total 300 tests
        TesterDouble testerDouble = new TesterDouble();
        testerDouble.setupDouble(); // returns 100 tests for each algorithm, total 300 tests
    }
}
