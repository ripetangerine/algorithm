#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int ans = 0;
    while(n){
        ans += n%10; 
        n /= 10;
    }
    return ans;
}