#include <stdio.h>
int main(){
    int s;
    scanf("%d",&s);
    if(100>=s && 90<=s){
        printf("A");
    }else if(89>=s && 80<=s){
        printf("B");
    }else if(79>=s && 70<=s){
        printf("C");
    }else if(69>=s && 60<=s){
        printf("D");
    }else{
        printf("F");
    }
    return 0;
}