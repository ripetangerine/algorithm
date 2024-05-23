class Solution {
    public int solution(int n) {
        String num[] = Integer.toString(n).split("");
        int answer =0; 
        for(int i=0; i<num.length; i++)
        {
            answer += Integer.parseInt(num[i]);
        }    
        return answer;
    }
}