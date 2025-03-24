#include <iostream>
using namespace std;

int main(){
    int h1, h2, h3;
    cin >> h1 >> h2 >> h3;
    if(h1+h2+h3 == 180){
        if(h1 == 60 && h2 == 60 && h3 == 60)
            cout << "Equilateral" << endl;
        else if(((h1==h2)&&(h1!=h3)) || ((h2==h3)&&(h2!=h1)) || ((h1==h3)&&(h1!=h2)))
            cout << "Isosceles" << endl;
        else 
            cout << "Scalene" << endl;
    }
    else{
        cout << "Error" << endl;
    }
}