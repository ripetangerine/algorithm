#include <stdio.h>
int main(void){
    int a,b;
    int N;
    scanf("%d",&N);
    for(int i=1;i<=N;i++){
        scanf("%d",&a);
        scanf("%d",&b);
        printf("%d\n",a+b);
    }
    return 0;
}