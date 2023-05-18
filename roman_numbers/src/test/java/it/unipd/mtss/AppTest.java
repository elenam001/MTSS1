package it.unipd.mtss;

// import junit.framework.Test;
// import junit.framework.TestCase;
// import junit.framework.TestSuite;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp() {
        App app = new App();
        int ciao = app.method();
        assertEquals(ciao, 1);
    }

    @Test
    public void evaluatesExpression() {
        App app = new App();
        int sum = app.evaluate("1+2+3");
        assertEquals(6, sum);
    }
  
}
