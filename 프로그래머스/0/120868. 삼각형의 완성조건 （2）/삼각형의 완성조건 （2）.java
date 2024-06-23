import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int x = sides[0];
        int X = sides[1];
        
        int ans = 0;
        
        for(int i=X-x+1; i<=X; i++){
            ans++;
        }
        for(int i=X+x-1; i>X; i--){
            ans++;
        }
        
        return ans; 
        
        
    }
}