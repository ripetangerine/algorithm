class Solution {
    public int solution(int[] numbers, int n) {
        
        int sum=0,i=0;
        
        for(i=0; sum<=n; i++){
            sum += numbers[i];
        }
        return sum;
        
        
    }
}