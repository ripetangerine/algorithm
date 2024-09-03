import java.util.*;
class Solution {
    public String[] solution(String myString) {
        ArrayList<String> list = new ArrayList<>();
        for(String s : myString.split("x")){
            if(!s.isEmpty()){
                list.add(s);
            }
        }
        
        String ans[] = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            ans[i] = list.get(i);
        }
        
        Arrays.sort(ans);
        
        return ans;
    }
}