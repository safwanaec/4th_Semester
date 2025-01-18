#include<bits/stdc++.h>
using namespace std;
#include <iostream>

double func(int x){
    return x*x*x - 3*x - 8;
}

double bisectionMethod(int a, int b, double tolarance){
    double c;
    while((b-a) >= tolarance){
        c = (a+b)/2;
        if(func(c) == 0.0){
            break;
        }
        else if(func(c)*func(a) < 0){
            b = c;
        }
        else{
            a = c;
        }
        printf("Root of the equation is: %lf\n",c);
    }
    return c;
}
int main(){
    int a,b;
    double tolarance = 0.0000001;
    cout << "Enter a number a: ";
    cin >> a;
    cout << "Enter a number b: ";
    cin >> b;
    cout << "Root of the equation is: " << bisectionMethod(a,b,tolarance) << endl;
}
//minhajcseru@gmail.com