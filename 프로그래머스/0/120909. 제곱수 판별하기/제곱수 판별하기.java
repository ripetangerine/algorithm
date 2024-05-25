class Solution {
    public int solution(int n) {
        
        double sp = Math.sqrt(n);
        if(sp-Math.floor(sp)==0)
            return 1;
        else {
            return 2;
        }
        
    }
}