#include <stdio.h>

int main(){
    int M,N;
    scanf("%d %d",&M,&N);
    
    int minimun=N, add=0;
    
    for(int i=M; i<=N; i++){
        int mea = 0;
        for(int j=2; j<=i; j++){
            if(i%j==0) mea++;
        }
        if(mea == 1){
            add+= i;
            if(minimun>i) minimun = i;
        } 
        
    }
    
    if(!add) printf("-1");
        
    else printf("%d\n%d",add,minimun);
    return 0;
}