#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
int solution(const char* my_string, const char* is_prefix) {
    bool flag = true;
    
    if(strlen(my_string) > strlen(is_prefix)){
        for(int i=0; i<strlen(is_prefix); i++){
            if(my_string[i]!=is_prefix[i]){          
                flag = false;
                break;
            }
        }
    }
    
    else
        flag = false;
    
    return flag?1:0;
               
    
}