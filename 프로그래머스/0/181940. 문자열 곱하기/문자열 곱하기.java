class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
       
        
        answer = my_string.repeat(k);
        System.out.println(answer);
        
        return answer;
    }
}