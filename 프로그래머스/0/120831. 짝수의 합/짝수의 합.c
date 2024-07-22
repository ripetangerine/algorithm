#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int recur(int, int);

int solution(int n) {
    return recur(n,2);
}
int recur(int times,int start){
    if(times<start) return 0; 
    return start + recur(times, start+2);
}