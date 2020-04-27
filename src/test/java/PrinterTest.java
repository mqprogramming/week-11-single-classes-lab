import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;
    Calculator calculator;

    @Before
    public void before() {
        printer = new Printer(50);
        calculator = new Calculator();
    }

    @Test
    public void hasPaper() {
        assertEquals( 50, printer.getSheetsOfPaper() );
    }

    @Test
    public void canPrint__true() {
        assertEquals( true, printer.print(10, 3));
    }

    @Test
    public void canPrint__false() {
        assertEquals( false, printer.print(10, 6));
    }

    @Test
    public void printTest() {
        printer.print(10, 3);
        assertEquals( 20, printer.getSheetsOfPaper() );
    }

}
