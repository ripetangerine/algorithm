#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

// arr_len은 배열 arr의 길이입니다.
int* solution(int arr[], size_t arr_len, int n) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    //int len = strlen(arr);
    int* answer = (int*)malloc(arr_len*sizeof(int)+1);
    
    if(arr_len%2){
        int j = 0;
        for(int i=0; i<arr_len; i++){
            if(i%2)
                answer[j++] = arr[i];
            else
                answer[j++] = n+arr[i]; 
        }
    }else{
        int j = 0;
        for(int i=0; i<arr_len; i++){
            if(i%2)
                answer[j++] = n+arr[i];
            else{
                answer[j++] = arr[i];   
            }   
        }
    }
    
    
    answer[arr_len] = 0;
    
    return answer;
}