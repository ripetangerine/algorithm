class Solution {
    public int solution(int n) {
        //person > 7 -> 2
        int answer =0;
        answer = n%7==0 ? n/7: (n/7)+1;
        
        
        return answer;
    }
}