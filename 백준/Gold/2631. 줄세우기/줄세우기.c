#include <stdio.h>

int arr[201], dp[201];

int main(){
    
    int N, max=0;
    scanf("%d",&N);
    
    for(int i=0; i<N; i++){
        int min = 0;
        scanf("%d",arr+i);
        
        for(int j=0; j<i; j++){
            if(arr[i]>arr[j] && dp[j]>min) min = dp[j];
        }
        dp[i] = min + 1;
        if(max < dp[i])
            max = dp[i];
    }
    printf("%d",N-max);
    return 0;
}