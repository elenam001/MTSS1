#include "roman.h"

char alfabeto[7] = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};

string lett_i[6] = {
    "  _____ ",
    " |_   _|",
    "   | |  ",
    "   | |  ",
    "  _| |_ ",
    " |_____|"
};
string lett_v[6] = {
    " __      __",
    " \\ \\    / /",
    "  \\ \\  / / ",
    "   \\ \\/ /  ",
    "    \\  /   ",
    "     \\/    "
};
string lett_x[6] = {
    " __   __",
    " \\ \\ / /",
    "  \\ V / ",
    "   > <  ",
    "  / . \\ ",
    " /_/ \\_\\"
};
string lett_l[6] = {
    "  _      ",
    " | |     ",
    " | |     ",
    " | |     ",
    " | |____ ",
    " |______|"
};
string lett_c[6] = {
    "   _____ ",
    "  / ____|",
    " | |     ",
    " | |     ",
    " | |____ ",
    "  \\_____|"
};
string lett_d[6] = {
    "  _____  ",
    " |  __ \\ ",
    " | |  | |",
    " | |  | |",
    " | |__| |",
    " |_____/ "
};
string lett_m[6] = {
    "  __  __ ",
    " |  \\/  |",
    " | \\  / |",
    " | |\\/| |",
    " | |  | |",
    " |_|  |_|"
};


void scomponi(int a[], int dim, int num) {
    int var = 10;
    for(int i = dim-1; i >= 0; i--) {
        if(num/var != 0) { 
            a[i] = num%var;
        } else {
            a[i] = num;
        }
        num/=var;
    }
}

std::string convNumLett(int n, int dim) {
    std::string s = "";
    if(n >= 5) {
        if(n == 9) { s += alfabeto[dim]; s += alfabeto[dim+2]; }
        else {
            s += alfabeto[dim+1];
            for(int i = 5; i < n; i++) s += alfabeto[dim];
        }
    } else {
        if(n == 4) { s += alfabeto[dim]; s += alfabeto[dim+1]; }
        else {
            for(int i = 0; i < n; i++) s += alfabeto[dim];
        }
    }
    return s;
}

std::string converti(int n) {
    std::string s = "";
    //scomporre numero
    int a[4];
    for(int i = 0; i < 4; i++) a[i] = 0;
    scomponi(a, 4, n);
    //associare ad ogni cifra la lettera corrispondente
    for(int i = 0; i < 4; i++) {
        switch(i) {
            case 0: //caso migliaia: 1000
                s += convNumLett(a[i], MIGLIAIA);
                break;
            case 1: //caso centinaia: 100-999
                s += convNumLett(a[i], CENITNAIA);
                break;
            case 2: //caso decine: 10-99
                s += convNumLett(a[i], DECINE);
                break;
            case 3: //caso unita': 0-9
                s += convNumLett(a[i], UNITA);
                break;
        }
    }
    return s;
}

void textToAscii(string text) {
    for(int j = 0; j < 6; j++) {
        for(int k = 0; k < text.length(); k++) {
            switch(text[k]) {
                case 'I':
                    cout << lett_i[j];
                    break;
                case 'V':
                    cout << lett_v[j];
                    break;
                case 'X':
                    cout << lett_x[j];
                    break;
                case 'L':
                    cout << lett_l[j];
                    break;
                case 'C':
                    cout << lett_c[j];
                    break;
                case 'D':
                    cout << lett_d[j];
                    break;
                case 'M':
                    cout << lett_m[j];
                    break;
            }
        }
        cout << endl;
    }
}