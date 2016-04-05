import static org.junit.Assert.*;
import org.junit.Test;

public class PinningTests {

    //////////////////////////////////////////////////////////////////////////////////////////
    // PINNING TESTS FOR: toString()
    //////////////////////////////////////////////////////////////////////////////////////////

    @Test
    public void TestToStringAlive(){
        Cell c = new Cell();
        c.setAlive(true);
        assertEquals(c.toString(), "X");
    }

    @Test
    public void TestToStringDead(){
        Cell c = new Cell();
        c.setAlive(false);
        assertEquals(c.toString(), ".");
    }

    @Test
    public void TestToStringUsingConstructorAlive(){
        Cell c = new Cell(true);
        assertEquals(c.toString(), "X");
    }

    @Test
    public void TestToStringUsingConstructorDead(){
        Cell c = new Cell(false);
        assertEquals(c.toString(), ".");
    }

    //////////////////////////////////////////////////////////////////////////////////////////
    // PINNING TESTS FOR: convertToInt()
    //////////////////////////////////////////////////////////////////////////////////////////

    @Test
    public void TestConvertToInt(){
        MainPanel mp = new MainPanel(10);
        int sampleInt = 10;
        int convertedInt = mp.convertToInt(sampleInt);
        assertEquals(sampleInt, convertedInt);
    }

    @Test
    public void TestConvertToIntMAX_VALUE(){
        MainPanel mp = new MainPanel(10);
        int sampleInt = Integer.MIN_VALUE;
        int convertedInt = mp.convertToInt(sampleInt);
        assertEquals(sampleInt, convertedInt);
    }

    @Test
    public void TestConvertToIntMIN_VALUE(){
        MainPanel mp = new MainPanel(10);
        int sampleInt = Integer.MAX_VALUE;
        int convertedInt = mp.convertToInt(sampleInt);
        assertEquals(sampleInt, convertedInt);
    }

}
