class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length; 
        int pow = 1;
        
        while(len>pow){
            pow *= 2;
        }
        
        int answer[] = new int[pow];
        
        for(int i=0; i<arr.length; i++){
            answer[i] = arr[i];
        }
        
        return answer;
    }
}