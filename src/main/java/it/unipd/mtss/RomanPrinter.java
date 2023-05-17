////////////////////////////////////////////////////////////////////
// Elena Marchioro 2009099
// Marco Favaretto 2000556
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

// import java.util.Scanner;

public class RomanPrinter {
    /**
     * ASCII-ART per lettera I
     */
    private static String[] lettera_I = { 
        "  _____ ", 
        " |_   _|", 
        "   | |  ", 
        "   | |  ", 
        "  _| |_ ", 
        " |_____|" 
    };
    /**
     * ASCII-ART per lettera V
     */
    private static String[] lettera_V = {
        " __      __",
        " \\ \\    / /",
        "  \\ \\  / / ",
        "   \\ \\/ /  ",
        "    \\  /   ",
        "     \\/    "
    };
    /**
     * ASCII-ART per lettera X
     */
    private static String[] lettera_X = {
        " __   __",
        " \\ \\ / /",
        "  \\ V / ",
        "   > <  ",
        "  / . \\ ",
        " /_/ \\_\\"
    };
    /**
     * ASCII-ART per lettera L
     */
    private static String[] lettera_L = {
        "  _      ",
        " | |     ",
        " | |     ",
        " | |     ",
        " | |____ ",
        " |______|"
    };
    /**
     * ASCII-ART per lettera C
     */
    private static String[] lettera_C = {
        "   _____ ",
        "  / ____|",
        " | |     ",
        " | |     ",
        " | |____ ",
        "  \\_____|"
    };
    /**
     * ASCII-ART per lettera D
     */
    private static String[] lettera_D = {
        "  _____  ",
        " |  __ \\ ",
        " | |  | |",
        " | |  | |",
        " | |__| |",
        " |_____/ "
    };
    /**
     * ASCII-ART per lettera M
     */
    private static String[] lettera_M = {
        "  __  __ ",
        " |  \\/  |",
        " | \\  / |",
        " | |\\/| |",
        " | |  | |",
        " |_|  |_|"
    };

    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }
    
    private static String printAsciiArt(String romanNumber) {
        String s = "";
        for(int j = 0; j < 6; j++) {
            for(int k = 0; k < romanNumber.length(); k++) {
                switch(romanNumber.charAt(k)) {
                    case 'I':
                        s.concat(lettera_I[j]);
                        break;
                    case 'V':
                        s.concat(lettera_V[j]);
                        break;
                    case 'X':
                        s.concat(lettera_X[j]);
                        break;
                    case 'L':
                        s.concat(lettera_L[j]);
                        break;
                    case 'C':
                        s.concat(lettera_C[j]);
                        break;
                    case 'D':
                        s.concat(lettera_D[j]);
                        break;
                    case 'M':
                        s.concat(lettera_M[j]);
                        break;
                }
            }   
            s.concat("\n");
        }
        return s;
    }

    // public static void main(String[] args) {
    //     String s = "";
    //     Scanner tastiera = new Scanner(System.in);
    //     System.out.println("Inserisci numerazione romana: ");
    //     s = tastiera.nextLine();
    //     tastiera.close();
    //     printAsciiArt(s);
    // }
}
