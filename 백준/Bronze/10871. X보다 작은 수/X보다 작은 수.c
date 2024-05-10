#include <stdio.h>
int main(){
    int N;
    scanf("%d",&N);
    int X;
    scanf("%d",&X);
    int a[100];
    int teto;
    for(int i=0; i<N; i++){
        scanf("%d",&teto);
        a[i]=teto;
        if(a[i]<X) printf("%d ",a[i]);
    }
}