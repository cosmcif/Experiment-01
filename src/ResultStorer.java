import java.util.ArrayList;
import java.util.List;

public class ResultStorer {
    private String algorithmName;
    private int arraySize;
    private String arrayType;
    private int shufflePercentage;
    private boolean isInverted;
    private long timeTaken;

    public ResultStorer(String algorithmName, int arraySize, String arrayType, int shufflePercentage, boolean isInverted, long timeTaken) {
        this.algorithmName = algorithmName;
        this.arraySize = arraySize;
        this.arrayType = arrayType;
        this.shufflePercentage = shufflePercentage;
        this.isInverted = isInverted;
        this.timeTaken = timeTaken;
    }

    public String getAlgorithmName() {
        return algorithmName;
    }

    public int getArraySize() {
        return arraySize;
    }

    public String getArrayType() {
        return arrayType;
    }

    public int getShufflePercentage() {
        return shufflePercentage;
    }

    public boolean getIsInverted() {
        return isInverted;
    }

    public long getTimeTaken() {
        return timeTaken;
    }

    public static void printCSVHeader() {
        System.out.println("algorithmName,arraySize,arrayType,shufflePercentage,isInverted,timeTaken");
    }

    public void printCSV() {
        System.out.println(algorithmName + "," + arraySize + "," + arrayType + "," + shufflePercentage + "," + isInverted + "," + timeTaken);
    }

}
