class Solution {
    public int[] solution(int[] arr) {
        int len = 0;
        for(int i=0; i<arr.length; i++){ //answer 배열의 길이
            len += arr[i];
        }
        
        int answer[] = new int[len];
        len = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i]; j++){
                answer[len] = arr[i];
                len++;
            }
        }
        return answer;
    }
}