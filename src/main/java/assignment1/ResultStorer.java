package assignment1;

import java.util.ArrayList;
import java.util.List;

/**
 * Tester for Integer
 */
public class ResultStorer {
    private String algorithmName;
    private int arraySize;
    private String arrayType;
    private int shufflePercentage;
    private boolean isInverted;
    private long timeTaken;

    /**
     * Constructor for ResultStorer
     * @param algorithmName the name of the algorithm
     * @param arraySize the size of the array
     * @param arrayType the type of the array
     * @param shufflePercentage the shuffle percentage of the array
     * @param isInverted whether the array is inverted
     * @param timeTaken the time taken to sort the array
     */
    public ResultStorer(String algorithmName, int arraySize, String arrayType, int shufflePercentage, boolean isInverted, long timeTaken) {
        this.algorithmName = algorithmName;
        this.arraySize = arraySize;
        this.arrayType = arrayType;
        this.shufflePercentage = shufflePercentage;
        this.isInverted = isInverted;
        this.timeTaken = timeTaken;
    }

    /**
     * Print the CSV header for the result of the test
     */
    public static void printCSVHeader() {
        System.out.println("algorithmName,arraySize,arrayType,shufflePercentage,isInverted,timeTaken");
    }

    /**
     * Print the CSV line for the result of the test
     */
    public void printCSV() {
        System.out.println(algorithmName + "," + arraySize + "," + arrayType + "," + shufflePercentage + "," + isInverted + "," + timeTaken);
    }

}
