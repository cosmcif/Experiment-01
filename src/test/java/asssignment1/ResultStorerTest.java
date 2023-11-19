package asssignment1;

//import org.junit.Test;
import assignment1.ResultStorer;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResultStorerTest {

    @Test
    public void testPrintCSV() {
        ResultStorer resultStorer = new ResultStorer("PassPerItem", 100, "Integer", 50, false, 1000);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        resultStorer.printCSV();
        System.setOut(System.out);
        assertEquals("PassPerItem,100,Integer,50,false,1000\n", outContent.toString());
    }

    @Test
    public void testPrintCSVHeader() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        ResultStorer.printCSVHeader();
        System.setOut(System.out);
        assertEquals("algorithmName,arraySize,arrayType,shufflePercentage,isInverted,timeTaken\n", outContent.toString());
    }

}
