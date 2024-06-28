import java.util.Arrays;
class Solution {
    public String[] solution(String my_string) {
        String ans[] = new String[my_string.length()];
        
        for(int i=0; i<ans.length; i++){
            ans[i] = my_string.substring(i,my_string.length());
        }
        
        Arrays.sort(ans);
        return ans; 
    }
}