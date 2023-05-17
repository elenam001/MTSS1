////////////////////////////////////////////////////////////////////
// Elena Marchioro 2009099
// Marco Favaretto 2000556
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    /**
     * <p> Random method to test javadoc
     * @param none nessun parametro
     * @return 1 per verificare assertEquals()
     * @see --boh
     */
    public int method() {
        return 1;
    }

    /**
     * <p>Data in input una somma come stringa ne ritorna il risultato come intero
     * @param expression stringa per somma
     * @return intero somma
     */
    public int evaluate(String expression) {
        int sum = 0;
        for (String summand : expression.split("\\+")) {
            sum += Integer.valueOf(summand);
        }
        return sum;
    }
      
}
