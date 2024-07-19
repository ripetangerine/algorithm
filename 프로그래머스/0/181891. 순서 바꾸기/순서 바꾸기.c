#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// num_list_len은 배열 num_list의 길이입니다.
int* solution(int num_list[], size_t num_list_len, int n) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    int* ans = (int*)malloc(num_list_len*sizeof(int));

    int ans_index = 0;
    for(int i=n; i<num_list_len; i++)
        ans[ans_index++]=num_list[i];
    
    for(int i=0; i<n; i++)
        ans[ans_index++]=num_list[i];
    
    
    return ans;
}