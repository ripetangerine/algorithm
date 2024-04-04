#include <stdio.h>
int main(){
    int g;
    scanf("%d",&g);
    
    if(g>=90 && g<=100){
        printf("A");
    }else if (g>=80 && g<=89){
        printf("B");
    }else if (g>=70 && g<=79){
        printf("C");
    }else if (g>=60 && g<=69){
        printf("D");
    }else {
        printf("F");
    }
    return 0;
}