class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int N = 0;
        if(ineq.equals(">")){
            if(eq.equals("="))
                n = (n>=m)? 1:0;
            else
                n = (n>m)? 1:0;
        }
        else{
            if(eq.equals("="))
                n = (n<=m)? 1:0;
            else
                n = (n<m)? 1:0;
        }
        return n;
    }
}