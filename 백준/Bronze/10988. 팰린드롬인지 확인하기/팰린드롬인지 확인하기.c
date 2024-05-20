#include <stdio.h>
#include <string.h>
int main(void){
    char word[101];
    scanf("%s",&word);
    int len = strlen(word);
    int answer = 1;

    for(int i=0; i<len/2; i++){
        if(word[i] != word[len-1-i])
            answer = 0;
    }

    printf("%d",answer);
    return 0;
}