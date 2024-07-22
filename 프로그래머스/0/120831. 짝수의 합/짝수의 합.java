class Solution {
    public int solution(int n) {
        return recur(n,2);
    }
    static int recur(int n,int start){
        if(start>n) return 0;
        return start+recur(n,start+2);
    }
}