class Solution {
    public int solution(int[] array, int n) {
        int diff=0,answer=0;
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<array.length; i++){
            diff = Math.abs(n-array[i]);
            if(diff<min){
                answer = array[i];
                min = diff;
                
            }else if(diff==min && array[i]<answer){
                answer = array[i];
            }
        }
        return answer;
    }
}