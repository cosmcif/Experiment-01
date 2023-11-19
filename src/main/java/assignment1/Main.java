package assignment1;

public class Main {
    public static void main(String[] args) {

        WarmUp.warmUp();
        ResultStorer.printCSVHeader();
        TesterInteger testerInteger = new TesterInteger();
        testerInteger.setupInteger();

        WarmUp.warmUp();
        TesterDouble testerDouble = new TesterDouble();
        testerDouble.setupDouble();

        WarmUp.warmUp();
        TesterString testerString = new TesterString();
        testerString.setupString();
    }
}
