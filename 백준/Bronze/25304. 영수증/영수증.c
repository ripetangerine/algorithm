#include <stdio.h>
int main(void){
    int X=0,N=0,a=0,b=0,sum=0;
    scanf("%d",&X);
    scanf("%d",&N);
    for(int i=1; i<=N; i++){
        scanf("%d",&a);
        scanf("%d",&b);
        sum += a*b;
    }
    if(sum==X) printf("Yes");
    else printf("No");
}