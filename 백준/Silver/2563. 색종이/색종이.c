#include <stdio.h>
#include <stdlib.h>

void changeBlack(int **e, int x, int y);
int countBlackPart(int **e);

int main(){
    int testcase, x, y;
    scanf("%d",&testcase);
    int **graph = (int**)malloc(sizeof(int*)*100);
    for(int i=0; i<100; i++){
        graph[i] = (int*)malloc(sizeof(int)*100);
        for(int j=0; j<100; j++){ //초기화
            graph[i][j] = 0;
        }
    }
    
    for(int i=0; i<testcase; i++){
        scanf("%d %d",&x, &y);
        changeBlack(graph, x, y);
    }
    
    printf("%d",countBlackPart(graph));
}

void changeBlack(int **e, int x, int y){
    for(int i=x; i<x+10; i++){
        if(i>=100) break;
        for(int j=y; j<y+10; j++){
            if(j>=100) break;
            if(e[i][j] != 1) e[i][j] = 1;
        }
    }
}

int countBlackPart(int **e){
    int rtn = 0;
    for(int i=0; i<100; i++){
        for(int j=0; j<100; j++){
            if(e[i][j] == 1) rtn ++; 
        }
    }
    return rtn;
}