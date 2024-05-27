class Solution {
    public String solution(int age) {
        String answer = "";
        String pro = "abcdefghij";
        String spli[] = String.valueOf(age).split("");
        for(int i=0; i<spli.length; i++){
            answer += pro.charAt(Integer.parseInt(spli[i]));
        }
        return answer;
    }
}