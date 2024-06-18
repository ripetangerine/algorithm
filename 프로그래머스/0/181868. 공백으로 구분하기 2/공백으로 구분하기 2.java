class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.trim().split("\\s+"); // 하나이상의 공백
        return answer;
    }
}