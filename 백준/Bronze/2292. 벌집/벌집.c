#include <stdio.h>
// 1 + 7 * 6 = 
// 1 * 6 


int main(){
    int i=1, answer=1;
    int N;
    
    scanf("%d",&N);
    
    while(N > i){
        i += 6*answer++;
    }
    
    printf("%d",answer);
}