//n을 입력 받은 뒤 n*1... n*9
#include <stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    
    int i =0;
    while(i<9){
        i++;
        printf("%d * %d = %d\n",n,i,n*i);
    }
}