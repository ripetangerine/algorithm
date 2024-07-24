#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(long long n) {
    // 리턴할 값은 메모리를 동적 할당해주세요.
    int len = 1;
    long long cnt = n;
    while(cnt){
        cnt/=10;
        len++;
    }
    
    int* answer = (int*)malloc(len*sizeof(int));
    
    cnt = n;
    int ans_cnt = 0; 
    for(int i=0; i<len; i++){
        answer[ans_cnt++] = cnt%10;
        cnt /= 10;
    }
    
    return answer;
}