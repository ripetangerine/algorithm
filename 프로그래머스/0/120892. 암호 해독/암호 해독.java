class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int i=code-1;
        while(i<cipher.length()){
            answer+=String.valueOf(cipher.charAt(i));
            i+=code;
        }
        return answer;
    }
}