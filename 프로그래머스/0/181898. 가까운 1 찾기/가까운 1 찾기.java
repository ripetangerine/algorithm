class Solution {
    public int solution(int[] arr, int idx) {
        
        int index=-1;
        for(int i=idx; i<arr.length; i++){
            if(arr[i]==1){
                index = i; 
                break;
            }
        }
        
        return index; 
    }
}