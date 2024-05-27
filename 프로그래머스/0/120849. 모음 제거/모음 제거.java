class Solution {
    public String solution(String my_string) {
        int cnt = 0;
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            switch(my_string.charAt(i)){
                case 'a' : case 'e' : case 'i' : case 'o' : case 'u' :
                    break;
                default : answer += Character.toString(my_string.charAt(i));
            }
        }
        return answer;
    }
}