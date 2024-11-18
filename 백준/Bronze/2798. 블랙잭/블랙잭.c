#include <stdio.h>

int main(){
    int testcase,Max;
    scanf("%d %d",&testcase,&Max);
    int arr[testcase];
    
    for(int i=0; i<testcase; i++){scanf("%d",arr+i);}
    
    int cmp = 0,answer = 0;
    
    for(int i=0; i<testcase; i++){
        for(int j=i+1; j<testcase; j++){
            for(int k=j+1; k<testcase; k++){
                cmp  = arr[i] + arr[j] + arr[k];
                if(cmp <= Max && answer < cmp) answer = cmp;
               
            }
        }
    }
    
    printf("%d",answer);
}