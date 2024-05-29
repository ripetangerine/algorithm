class Solution {
    public int[] solution(int[] num_list, int n) {
        int ans[] = new int[num_list.length-n+1];
        int cnt = 0 ;
        for(int i=n-1; i<num_list.length; i++){
            ans[cnt] = num_list[i];
            cnt++;
        }
        return ans;
    }
}