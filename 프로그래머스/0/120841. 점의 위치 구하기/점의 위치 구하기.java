class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        int a = dot[0];
        int b = dot[1];
        if(a>0){
            if(b>0) answer = 1;
            else answer = 4;
        }
        else{
            if(b>0) answer = 2;
            else answer = 3;
        }
        return answer;
    }
}