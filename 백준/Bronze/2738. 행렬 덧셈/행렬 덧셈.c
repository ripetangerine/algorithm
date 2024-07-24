#include <stdio.h>

int main(){
    int n,m;
    scanf("%d %d",&n,&m);
    int a[n][m];
    int b[n][m];
    int ans[n][m]; //{{1,1,1},{2,2,2},{0,1,0}}
    
    //입력
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            scanf("%d",&a[i][j]);
        }
    }
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            scanf("%d",&b[i][j]);
        }
    }
    
    //연산
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            ans[i][j] = a[i][j]+b[i][j];
        }
    }
    
    //출력
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            printf("%d ",ans[i][j]);
        }
        printf("\n");
    }
    
    
    return 0;
}