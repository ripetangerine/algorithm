class Solution {
    public int[] solution(int[] array) {
        int cnt=0;
        int max=array[0];
        for(int i=1; i<array.length; i++){
            if(array[i]>max){
                max=array[i];
                cnt =i;
            }
            
        }
        int answer[] = {max,cnt};
        return answer;
    }
}