import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        char a[] = before.toCharArray();
        char b[] = after.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        String str1 = new String(a);
        String str2 = new String(b);
        
        if(str1.equals(str2)){
            return 1;
        }
        else{
            return 0;
        }
    }
}