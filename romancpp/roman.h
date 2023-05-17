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

// char alfabeto[7];

// string lett_i[6];
// string lett_v[6];
// string lett_x[6];
// string lett_l[6];
// string lett_c[6];
// string lett_d[6];
// string lett_m[6];

void scomponi(int a[], int dim, int num);

string convNumLett(int n, int dim);

string converti(int n);

void textToAscii(string text);

#endif