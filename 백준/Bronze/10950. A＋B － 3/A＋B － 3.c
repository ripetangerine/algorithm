#include <stdio.h>
int main(){
    int T,a,b;
    scanf("%d",&T);
    
    int i=0;
    while(i<T){
        i++;
        scanf("%d %d",&a,&b);
        printf("%d\n",a+b);
    }

    return 0;
}