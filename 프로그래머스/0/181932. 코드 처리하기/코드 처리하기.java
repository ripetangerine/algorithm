class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        for(int i=0; i<code.length(); i++){
            if((int)(code.charAt(i)-'0') == 1)
                mode = (mode==0) ? 1: 0;
            
            if(mode == 1 && i%2==1 && code.charAt(i)!='1') ret += code.charAt(i);
            else if(mode ==0 && i%2==0 && code.charAt(i)!='1') ret += code.charAt(i);
        }
        return ret = (ret=="")? "EMPTY" : ret;
    }
}