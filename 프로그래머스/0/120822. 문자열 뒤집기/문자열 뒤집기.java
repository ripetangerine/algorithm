class Solution {
    public String solution(String my_string) {
        String answer = "";

        for(int i=my_string.length()-1; i>=0; i--){
            answer += Character.toString(my_string.charAt(i));
        }
        return answer;
    }
}