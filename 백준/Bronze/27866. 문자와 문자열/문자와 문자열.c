#include <stdio.h>
int main(){
    char string[1001];
    int number;
    scanf("%s",string);
    scanf("%d",&number);
    
    printf("%c",string[number-1]);
    
    return 0;
}