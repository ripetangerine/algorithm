#include <stdio.h>

int main(){
    int n,m; 
    scanf("%d %d",&n,&m); //n은 배열 크기, m은 바구니를 역순 횟수
    
    int arr[n];
    for(int i=0;i<n;i++)
        arr[i] = i+1;
    
   //역순
    //역순 루프 총 횟수
    for(int i=0; i<m; i++){
        //두 역순의 시작, 끝 입력
        int a,b;
        scanf("%d %d",&a,&b);
        a--; b--;
        //역순만들기
        while(a<b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
        
    }   
    for(int i=0; i<n; i++)
        printf("%d ",arr[i]);
    
    return 0;
}