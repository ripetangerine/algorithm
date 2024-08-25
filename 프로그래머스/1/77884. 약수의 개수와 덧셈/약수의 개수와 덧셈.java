class Solution {
    public int solution(int left, int right) {
        int cnt = 0;
        int ans = 0;
        for(int i=left; i<=right; i++){
            
            for(int j=1; j<=i; j++){
                if(i%j==0) cnt++;
            }
            if(cnt%2==0) ans+=i;
            else ans-=i;
            
            cnt = 0;
        }
        return ans;
    }
}