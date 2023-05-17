// package it.unipd.mtss;

import java.util.Scanner;

public class RomanPrinter {
    static String[] lett_i = { 
        "  _____ ", 
        " |_   _|", 
        "   | |  ", 
        "   | |  ", 
        "  _| |_ ", 
        " |_____|" 
    };
    static String[] lett_v = {
        " __      __",
        " \\ \\    / /",
        "  \\ \\  / / ",
        "   \\ \\/ /  ",
        "    \\  /   ",
        "     \\/    "
    };
    static String[] lett_x = {
        " __   __",
        " \\ \\ / /",
        "  \\ V / ",
        "   > <  ",
        "  / . \\ ",
        " /_/ \\_\\"
    };
    static String[] lett_l = {
        "  _      ",
        " | |     ",
        " | |     ",
        " | |     ",
        " | |____ ",
        " |______|"
    };
    static String[] lett_c = {
        "   _____ ",
        "  / ____|",
        " | |     ",
        " | |     ",
        " | |____ ",
        "  \\_____|"
    };
    static String[] lett_d = {
        "  _____  ",
        " |  __ \\ ",
        " | |  | |",
        " | |  | |",
        " | |__| |",
        " |_____/ "
    };
    static String[] lett_m = {
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
                        System.out.print(lett_i[j]);
                        break;
                    case 'V':
                        System.out.print(lett_v[j]);
                        break;
                    case 'X':
                        System.out.print(lett_x[j]);
                        break;
                    case 'L':
                        System.out.print(lett_l[j]);
                        break;
                    case 'C':
                        System.out.print(lett_c[j]);
                        break;
                    case 'D':
                        System.out.print(lett_d[j]);
                        break;
                    case 'M':
                        System.out.print(lett_m[j]);
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

