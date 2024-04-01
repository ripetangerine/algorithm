#include <stdio.h>
int main(){
    int Sco;
    scanf("%d",&Sco);
    
    if(90<=Sco && 100>=Sco){
        printf("A");
    }
    else if(80<=Sco && 89>=Sco){
        printf("B");
    }
    else if(70<=Sco && 79>=Sco){
        printf("C");
    }
    else if(60<=Sco && 69>=Sco){
        printf("D");
    }
    else{
        printf("F");
    }
    return 0;

}
//90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F