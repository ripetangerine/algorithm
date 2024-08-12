import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=l; i<=r; i++){
            if(isZeroOrFiveOnly(i))
                list.add(i);                
             
        }
        if(list.size()==0) list.add(-1);
        int ans[] = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
    private boolean isZeroOrFiveOnly(int number){
        String str = String.valueOf(number);
        for(char c : str.toCharArray()){
            if(c!='0'&&c!='5')
                return false;
        }
        return true;
    }
}