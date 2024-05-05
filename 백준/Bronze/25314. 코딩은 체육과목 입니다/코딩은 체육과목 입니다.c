#include <stdio.h>
int main(){
    int N=0;
    scanf("%d",&N);
    for(int i=1; N/4>=i; i++){
        printf("long ");
    }
    printf("int");
}