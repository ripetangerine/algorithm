import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        int[] answer = new int[k];
        
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                answer[cnt++] = arr[i];
            }
            if(cnt == k) break;
        }
        for(int i=cnt; i<k; i++)
            answer[i] = -1;
        
        /**
            set 을 이용함. ->       
        */
        
        return answer;
    }
}