#include <stdio.h>

int main(){
    const int arrLen;
    scanf("%d",&arrLen);
    int array[arrLen];
    for(int i=0; i<arrLen; i++)
        scanf("%d",array+i);
    
    
    int answer = 0; //전체 결과
    int temp = 0; //나눠지는 수 감지에 사용
    for(int i=0; i<arrLen; i++){
        for(int j=1; j<=array[i]; j++){
            if(array[i]%j==0) temp++;
        }
        if(temp==2) answer++;
        temp = 0;
    }
    printf("%d",answer); 
}