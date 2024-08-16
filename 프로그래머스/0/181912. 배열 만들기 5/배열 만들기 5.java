import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        String fir[] = new String[intStrs.length];
        int len = intStrs.length;
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0; i<len; i++){
            fir[i] = intStrs[i].substring(s,s+l);
        }
        
        for(int i=0; i<len; i++){
            if(k<Integer.parseInt(fir[i]))
                ans.add(Integer.parseInt(fir[i]));
        }
        Integer tmp[] = ans.toArray(new Integer[0]);
        int answer[] = new int[tmp.length];
        for(int i=0; i<tmp.length; i++){
            answer[i] = tmp[i];
        }
        
        return answer;
    }
}