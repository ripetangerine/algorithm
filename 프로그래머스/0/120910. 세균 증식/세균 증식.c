#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n, int t) {
    //int answer = 1;
    for(int i=1; i<=t; i++){
        n *=2;
    }
    return n;
}