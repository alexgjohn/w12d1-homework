import com.codeclan.example.Printer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 200);
    }

    @Test
    public void hasSheetsRemaining(){
        int result = printer.getSheetsRemaining();
        assertEquals(100, result);
    }

    @Test
    public void hasToner(){
        int result = printer.getTonerVolume();
        assertEquals(200, result);
    }

    @Test
    public void canPrint(){
        printer.print(5, 4);
        int sheetsResult = printer.getSheetsRemaining();
        int tonerResult = printer.getTonerVolume();
        assertEquals(80, sheetsResult);
        assertEquals(180, tonerResult);
    }

    @Test
    public void willNotPrintWhenInsufficientPaper(){
        printer.print(50, 4);
        int sheetsResult = printer.getSheetsRemaining();
        int tonerResult = printer.getTonerVolume();
        assertEquals(100, sheetsResult);
        assertEquals(200, tonerResult);
    }

}
