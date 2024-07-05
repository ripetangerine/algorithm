class Solution {
    public int[][] solution(int n) {
        int arr[][] = new int[n][n];
        
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(cnt==j)
                    arr[i][j] = 1; 
                else
                    arr[i][j] = 0;
            }   
            cnt++;
        }
        return arr;
    }
}