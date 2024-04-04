#include <stdio.h>
int main(){
    int A,B;
    scanf("%d %d",&A,&B);
    
    if(A>0){
        if(B>0){
            printf("%d",1);
        }else{
            printf("%d",4);
        }
    }if(A<0){
        if(B>0){
            printf("%d",2);
        }else{
            printf("%d",3);
        }        
    }
    return 0;
}