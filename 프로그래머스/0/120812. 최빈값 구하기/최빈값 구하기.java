import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int max = array[array.length-1]; //{1,2,3,3,4} max = 4; {1,3,4,9}
        int cnt[] = new int[max+1]; // cnt의 길이는 5; cnt 길이는 10;
        for(int i=0; i<array.length; i++){ //array의 길이는 5; / 4;
            cnt[array[i]]++; 
        }
        max = cnt[0];
        int answer = 0;
        for(int i=1; i<cnt.length; i++){
            if(max<cnt[i]){
                max = cnt[i];
                answer = i;
            }
            else if(max==cnt[i])
                answer = -1;
        }
        return answer; 
    }
}