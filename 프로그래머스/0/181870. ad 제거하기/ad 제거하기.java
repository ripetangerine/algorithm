import java.util.ArrayList; 
class Solution {
    public String[] solution(String[] strArr) {
        ArrayList <String> list = new ArrayList<>();
        for(String S : strArr){
            if(!(S.contains("ad"))){
                list.add(S);
            }
        }
        return list.toArray(new String[0]);
    }
}