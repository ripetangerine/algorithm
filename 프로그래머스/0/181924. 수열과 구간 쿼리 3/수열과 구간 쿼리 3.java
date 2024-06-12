class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        //int ans[] = new int[arr.length];
        for(int i=0; i<queries.length; i++){
            for(int j=0; j<queries[0].length-1; j++){
                int temp = arr[queries[i][j]];
                arr[queries[i][j]] = arr[queries[i][j+1]];
                arr[queries[i][j+1]] = temp;
            }
        }
        return arr;
    }
}