#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#define NUM 26

int main(){
    char word[1000005];
    scanf("%s",word);
    int alphabet[NUM] = {0};
    int len = strlen(word);
    
    //소문자로 제작
    for(int i=0; i<len; i++){
        if(word[i]>='A' && word[i]<='Z'){
             word[i] = tolower(word[i]);
        }
    }
    
    //alphabet에 축척함으로서 개수 세기
    for(int i=0; i<len; i++){
        if(word[i]>='a' && word[i]<='z'){
            alphabet[word[i]-'a']++;
        }
    }
    
    int max1=alphabet[0],index=0;

    //검사(max)
    for(int i=1; i<NUM; i++){
        if(max1<alphabet[i]){
            max1 = alphabet[i];
            index = i;
        }  
    }
    char answer = (char)(index+'A');

    //재검사 "??"에 대한 예외처리
    for(int i=0; i<NUM; i++)
        if(max1==alphabet[i] && i != index) answer = '?';
    
    printf("%c",answer);
    
    return 0;
}