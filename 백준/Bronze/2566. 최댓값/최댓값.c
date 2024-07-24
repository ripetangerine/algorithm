#include <stdio.h>

int main(){
    
    int arr[9][9];
    
    //입력 
    for(int i=0; i<9; i++){
        for(int j=0; j<9; j++)
            scanf("%d",&arr[i][j]);
    }
    int max = 0;
    int index[2];
    
    //최대값 구하기
    for(int i=0; i<9; i++){
        for(int j=0; j<9; j++){
            if(max<=arr[i][j]){
                max = arr[i][j];
                index[0]=i+1;
                index[1]=j+1;
            }
        }
    }
    printf("%d\n",max);
    printf("%d %d",index[0],index[1]);
    
    return 0;

}