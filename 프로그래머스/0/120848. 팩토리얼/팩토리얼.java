class Solution {
    public int solution(int n) {
        int answer = 1;
        int cnt = 0; 
        for(int i=1; n>=answer; i++){
            answer *= i;
            cnt ++;
        }
        return cnt-1;
    }
}