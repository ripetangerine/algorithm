#include <stdio.h>
#include <stdbool.h>
#include <string.h>
#include <stdlib.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
char* solution(const char* my_string, int m, int c) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    
    int len = strlen(my_string);
    //답안 배열 초기화 : 
    char* answer = (char*)malloc((len/m+1)*sizeof(char));
    
    //index에 맞도록 c를 1씩 빼줌(주의)
    c--;
    int add = m-c;
    int cnt = 0;
    
    for(int i=c; i<len; i+=m){
        answer[cnt++] = my_string[i];
    }
    
    answer[len/m] = '\0';
    
    return answer;
    
    free(answer);
}