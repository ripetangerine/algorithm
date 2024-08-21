class Solution {
    public String solution(String s) {
        String ans = "";
        if(s.length()%2==1)
            ans += s.charAt(s.length()/2);
        else{
            ans += s.charAt(s.length()/2-1);
            ans += s.charAt(s.length()/2);
        }
        return ans;
    }
}