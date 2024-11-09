#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int ind = 0; //null
int arr[10000] = {-1};

void push(int x){
    arr[ind++] = x;
}
int pop(){
    return ind!=0?arr[--ind]:-1;
}
int size(){
    return ind;
}
int empty(){
    return ind==0?1:0;
}
int top(){
    return ind==0?-1:arr[ind-1];
}
int print(){
    printf("\n");
    for(int i=0; i<ind; i++){
        printf(" %d ", arr[i]);
    }
    printf("*** end *** ");
}

int main(){
    int testcase,num;
    char str[6];
    scanf("%d",&testcase);
    int answer[testcase];
    int indd = 0;
    
    for(int i=0; i<testcase; i++){
        scanf("%s",str);
        
        if(strcmp(str,"push")==0){
            scanf("%d",&num);
            push(num);
        }
        else if(strcmp(str,"pop")==0){
            answer[indd++] = pop();
        }
        else if(strcmp(str,"size")==0){
            answer[indd++] = size();
        }
        else if(strcmp(str,"empty")==0){
            answer[indd++] = empty();
        }
        else if(strcmp(str,"top")==0){
            answer[indd++] = top();
        }
        
    }
    
    for(int i=0; i<indd; i++){
        printf("%d\n",answer[i]);
    }
    
}