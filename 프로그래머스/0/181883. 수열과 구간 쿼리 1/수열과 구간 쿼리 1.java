class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for(int[] qur : queries){
            int s = qur[0];
            int e = qur[1];
            
            for(int i=s; i<=e; i++){
                arr[i]++;
            }
        }
        return arr;
    }
}