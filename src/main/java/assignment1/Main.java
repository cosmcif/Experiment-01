package assignment1;

public class Main {
    public static void main(String[] args) {
        ResultStorer.printCSVHeader();
        TesterInteger testerInteger = new TesterInteger();
        testerInteger.setupInteger(); 
        TesterDouble testerDouble = new TesterDouble();
        testerDouble.setupDouble(); 
        TesterString testerString = new TesterString();
        testerString.setupString(); 
    }
}
