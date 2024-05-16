#include <stdio.h>
#include <string.h>
int main(void){
    int T;
    scanf("%d",&T);
    for(int i=0; i<T; i++){
        int repeat;
        scanf("%d",&repeat);
        char str[21];
        scanf("%s",&str);
        
        for(int j=0; j<strlen(str); j++){
            for(int n=0; n<repeat; n++){
                printf("%c",str[j]);
            }
        }
    printf("\n");
    }
    return 0;
}