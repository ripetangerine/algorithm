#include <stdio.h>
#include <string.h>
int main(void){
    int N;
    scanf("%d",&N);
    char str[1001];
    for(int i=0; i<N; i++){
        scanf("%s",&str);
        printf("%c%c\n",str[0],str[strlen(str)-1]);
    }
    //return 0;
}