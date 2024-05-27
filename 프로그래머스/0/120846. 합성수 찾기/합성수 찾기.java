class Solution {
    public int solution(int n) {
        int cnt = 0, hap = 0;
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i%j==0) cnt++;
            }
            if(cnt>=3) hap ++; 
            cnt =0;
        }
        return hap ;
    }
}