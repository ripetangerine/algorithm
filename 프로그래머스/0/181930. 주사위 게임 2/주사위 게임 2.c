#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int a, int b, int c) {
    int score=0;
    if((a==b|b==c|c==a)){
       
        if(a==b&&a==c) score = (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
        else if ((a==b&&a!=c)|(b==c&&b!=a)|(c==a&&c!=b)){
            score =(a+b+c)*(a*a+b*b+c*c);
        }
    }
    
    else if(a!=b&&a!=c&&c!=b){
        score = a+b+c;
    }
    
    return score;
    
    
}