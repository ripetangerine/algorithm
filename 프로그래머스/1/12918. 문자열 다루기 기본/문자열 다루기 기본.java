class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        for(int i=0; i<s.length(); i++){
            char pre = s.charAt(i);
            if(pre<'0'||pre>'9'||s.length()!=4&&s.length()!=6){
                answer = false;
                break;
            }
        }
        return answer;
    }
}