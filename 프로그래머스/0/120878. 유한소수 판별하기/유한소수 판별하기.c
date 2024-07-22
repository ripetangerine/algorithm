#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int a, int b) {
    //기약분수까지 나눔
    for(int i=2; i<=a&&i<=b; i++){
        while(a%i==0&&b%i==0){
            a /= i;
            b /= i; 
        }
        
    }
    
    //소인수를 2,5만 있는지 검사(유한소수)
    bool flag = true;
    while(b>1){
        if(b%2==0)
            b/=2;
        else if(b%5==0)
            b/=5;
        else{
            flag = false;
            break;
        }
    }
    
    return  flag?1:2;
}