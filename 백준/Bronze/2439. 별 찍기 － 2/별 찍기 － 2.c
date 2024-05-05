#include <stdio.h>
int main(){
    int N,a=0;
    scanf("%d",&N);
    
    for(int i=1; N>=i; i++){
        for(int j=1; N-i>=j; j++)
            printf(" ");
        for(int j=1; j<=i; j++){
            printf("*");
        }
        printf("\n");
    }
    return 0; 
        
}