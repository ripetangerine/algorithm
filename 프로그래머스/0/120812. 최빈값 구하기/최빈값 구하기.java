import java.util.Arrays; 
class Solution {
    public int solution(int[] array) {
        int mx = array[0];
        for(int i=0; i<array.length; i++){
            if(mx<array[i])
                mx = array[i];
        }
        
        int cnt[] = new int[mx+1];
        
        for(int i=0; i<array.length; i++){
            cnt[array[i]]++;
        }
        
        int index = 0; 
        mx = 0;
        for(int i=0; i<cnt.length; i++){
            if(mx < cnt[i]){
                index = i;
                mx = cnt[i];
            }
            else if(mx == cnt[i])
                index = -1;
        }
        return index; 
    }
}