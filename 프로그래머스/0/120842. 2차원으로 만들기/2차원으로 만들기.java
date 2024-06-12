class Solution {
    public int[][] solution(int[] num_list, int n) {
        int ans[][] = new int[num_list.length/n][n];
        int cnt = 0;
        for(int i=0; i<ans.length; i++){
            for(int j=0; j<n; j++){
                ans[i][j] = num_list[cnt];
                cnt++;
            }
        }
        return ans;
    }
}