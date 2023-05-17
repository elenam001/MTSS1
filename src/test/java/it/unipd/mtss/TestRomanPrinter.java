package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for RomanPrinter
*/
public class TestRomanPrinter {
    /** 
     * Test singola lettera I
    */
    @Test
    public void test_I() {
        assertEquals("  _____ \n |_   _|\n   | |  \n   | |  \n  _| |_ \n |_____|\n", RomanPrinter.print(1));
    }
    /** 
     * Test singola lettera V
    */
    @Test
    public void test_V() {
        assertEquals(" __      __\n \\ \\    / /\n  \\ \\  / / \n   \\ \\/ /  \n    \\  /   \n     \\/    \n", RomanPrinter.print(5));
    }
    /** 
     * Test singola lettera X
    */
    @Test
    public void test_X() {
        assertEquals(" __   __\n \\ \\ / /\n  \\ V / \n   > <  \n  / . \\ \n /_/ \\_\\\n", RomanPrinter.print(10));
    }
    /** 
     * Test singola lettera L
    */
    @Test
    public void test_L() {
        assertEquals("  _      \n | |     \n | |     \n | |     \n | |____ \n |______|\n", RomanPrinter.print(50));
    }
    /** 
     * Test singola lettera C
    */
    @Test
    public void test_C() {
        assertEquals("   _____ \n  / ____|\n | |     \n | |     \n | |____ \n  \\_____|\n", RomanPrinter.print(100));
    }
    /** 
     * Test singola lettera D
    */
    @Test
    public void test_D() {
        assertEquals("  _____  \n |  __ \\ \n | |  | |\n | |  | |\n | |__| |\n |_____/ \n", RomanPrinter.print(500));
    }
    /** 
     * Test singola lettera M
    */
    @Test
    public void test_M() {
        assertEquals("  __  __ \n |  \\/  |\n | \\  / |\n | |\\/| |\n | |  | |\n |_|  |_|\n", RomanPrinter.print(1000));
    }
}
