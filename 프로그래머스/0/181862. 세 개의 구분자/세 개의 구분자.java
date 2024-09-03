import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : myStr.split("[abc]")){
            if(!s.isEmpty()) list.add(s);
        }
        
        if(list.size()==0) return new String[]{"EMPTY"};
        
        String ans[] = new String[list.size()];
        
        for(int i=0; i<list.size(); i++){
            ans[i] = list.get(i);
        }
        
        return ans;
        
    }
}