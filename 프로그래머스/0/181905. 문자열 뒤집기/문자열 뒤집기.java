class Solution {
    public String solution(String my_string, int s, int e) {
        String temp = "";
        
        //바꿀부분을 추출
        for(int i=e; i>=s; i--){
            temp += my_string.charAt(i);
        }
        
        String answer = "";
        for(int i=0; i<s; i++){
            answer += my_string.charAt(i);
        }
        
        answer += temp;
        
        for(int i=e+1; i<my_string.length(); i++){
            answer += my_string.charAt(i);
        }
        
        return answer;
    }
}