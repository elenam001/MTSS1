// package it.unipd.mtss;

import java.util.Scanner;

public class RomanPrinter {
    /**
     * ASCII-ART per lettera I
     */
    static String[] lettera_I = { 
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
    static String[] lettera_V = {
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
    static String[] lettera_X = {
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
    static String[] lettera_L = {
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
    static String[] lettera_C = {
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
    static String[] lettera_D = {
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
    static String[] lettera_M = {
        "  __  __ ",
        " |  \\/  |",
        " | \\  / |",
        " | |\\/| |",
        " | |  | |",
        " |_|  |_|"
    };

    // public static String print(int num){
    //     return printAsciiArt(IntegerToRoman.convert(num));
    // }
    
    /* private */ 
    public static void printAsciiArt(String romanNumber) {
        for(int j = 0; j < 6; j++) {
            for(int k = 0; k < romanNumber.length(); k++) {
                switch(romanNumber.charAt(k)) {
                    case 'I':
                        System.out.print(lettera_I[j]);
                        break;
                    case 'V':
                        System.out.print(lettera_V[j]);
                        break;
                    case 'X':
                        System.out.print(lettera_X[j]);
                        break;
                    case 'L':
                        System.out.print(lettera_L[j]);
                        break;
                    case 'C':
                        System.out.print(lettera_C[j]);
                        break;
                    case 'D':
                        System.out.print(lettera_D[j]);
                        break;
                    case 'M':
                        System.out.print(lettera_M[j]);
                        break;
                }
            }   
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String s = "";
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci numerazione romana: ");
        s = tastiera.nextLine();
        tastiera.close();
        printAsciiArt(s);
    }
}

