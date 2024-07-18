#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// numbers_len은 배열 numbers의 길이입니다.
double solution(int numbers[], size_t numbers_len) {
    int add=0;
    
    for(int i=0;i<numbers_len;i++){
        add+=numbers[i];
    }
    
    return (double)add/numbers_len;
}