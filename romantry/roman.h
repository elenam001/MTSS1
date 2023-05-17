#ifndef ROMAN_H
#define ROMAN_H

#include<iostream>
using std::cout;
using std::cin;
using std::endl;
#include<string>
using std::string;

#define UNITA 0
#define DECINE 2
#define CENITNAIA 4
#define MIGLIAIA 6

/*
    Scompone numero in input (num) 
    salvando ogni cifra all'interno di una cella dell'array
*/
void scomponi(int a[], int dim, int num);

/*
    Associa alla cifra e al valore (unita', decine, centinaia, migliaia)
    la/e corrispettiva/e lettera/e della numerazione romana 
*/
string convNumLett(int n, int dim);

/*
    Converte un numero in input in una stringa nella numerazione romana
    usando le funzioni scomponi(int[], int, int) e convNumLett(int, int)
*/
string converti(int n);

/*
    Stampa la stringa prodotta dalla funzione converti(int)
    in ASCII-art
*/
void textToAscii(string text);

#endif