import java.util.ArrayList;
class Solution {
    public int[] solution(int n, int k) {
        int ans[] = new int[n/k];
        int cnt = 0;
        
        for(int i=1; i<=n/k; i++){
            ans[cnt] = i*k;
            cnt ++;
        }
        return ans;
    }
}