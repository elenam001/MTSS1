package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for IntegerToRoman
*/
public class TestIntToRoman {

    /**
     * Test conversione
    */
    @Test
    public void testScomposizione() {
        int[] prova = {0,2,3,1};
        IntegerToRoman.scomponi(231);
        int[] res = IntegerToRoman.a; 
        assertArrayEquals(prova, res);
    }

    /**
     * Test singole lettere
    */
    @Test
    public void testConvNumLett_I() {
        assertEquals('I', IntegerToRoman.convNumLett(1, IntegerToRoman.UNITA));
    }
    @Test
    public void testConvNumLett_V() {
        assertEquals("V", IntegerToRoman.convNumLett(5, IntegerToRoman.UNITA));
    }
    @Test
    public void testConvNumLett_X() {
        assertEquals("X", IntegerToRoman.convNumLett(10, IntegerToRoman.DECINE));
    }
    @Test
    public void testConvNumLett_L() {
        assertEquals("L", IntegerToRoman.convNumLett(50, IntegerToRoman.DECINE));
    }
    @Test
    public void testConvNumLett_C() {
        assertEquals("C", IntegerToRoman.convNumLett(100, IntegerToRoman.CENTINAIA));
    }
    @Test
    public void testConvNumLett_D() {
        assertEquals("D", IntegerToRoman.convNumLett(500, IntegerToRoman.CENTINAIA));
    }
    @Test
    public void testConvNumLett_M() {
        assertEquals("M", IntegerToRoman.convNumLett(1000, IntegerToRoman.MIGLIAIA));
    }

    /**
     * Test per casi particolari: 4, 9, 40, 90, 400, 900
    */
    @Test
    public void testConvNumLett_4Unita() {
        assertEquals("IV", IntegerToRoman.convNumLett(4, IntegerToRoman.UNITA));
    }
    @Test
    public void testConvNumLett_9Unita() {
        assertEquals("IX", IntegerToRoman.convNumLett(9, IntegerToRoman.UNITA));
    }
    @Test
    public void testConvNumLett_4Decine() {
        assertEquals("XL", IntegerToRoman.convNumLett(4, IntegerToRoman.DECINE));
    }
    @Test
    public void testConvNumLett_9Decine() {
        assertEquals("XC", IntegerToRoman.convNumLett(9, IntegerToRoman.DECINE));
    }
    @Test
    public void testConvNumLett_4Centinaia() {
        assertEquals("CD", IntegerToRoman.convNumLett(4, IntegerToRoman.CENTINAIA));
    }
    @Test
    public void testConvNumLett_9Centinaia() {
        assertEquals("CM", IntegerToRoman.convNumLett(9, IntegerToRoman.CENTINAIA));
    }

    /**
     * Test conversione completa
    */
    @Test
    public void testConversione() {
        assertEquals("", IntegerToRoman.convert(0));
    }
}

