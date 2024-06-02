class Solution {
    public int[] solution(int start, int end_num) {
        int cnt = 0;
        int ans[] = new int[start-end_num+1];
        
        for(int i=start; i>=end_num; i--){
            ans[cnt] = i;
            cnt++;
        }
        return ans;
    }
}