package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for RomanPrinter
*/
public class TestRomanPrinter {
    /** */
    @Test
    public void test_I() {
        assertEquals("  _____ \n |_   _|\n   | |  \n   | |  \n  _| |_ \n |_____|\n", RomanPrinter.print(1));
    }
}
