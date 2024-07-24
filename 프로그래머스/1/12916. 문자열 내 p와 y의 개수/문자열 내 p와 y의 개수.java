class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int y_cnt = 0,p_cnt=0;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='Y'||s.charAt(i)=='y')
                y_cnt++;
            else if(s.charAt(i)=='P'||s.charAt(i)=='p')
                p_cnt++;
        }
        
        return (y_cnt==p_cnt)?true:false;
    }
}