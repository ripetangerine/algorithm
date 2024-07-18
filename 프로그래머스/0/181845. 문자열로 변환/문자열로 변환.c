#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(int n) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    char* answer = (char*)malloc(20);
    
    sprintf(answer,"%d",n);
    
    return answer;
}