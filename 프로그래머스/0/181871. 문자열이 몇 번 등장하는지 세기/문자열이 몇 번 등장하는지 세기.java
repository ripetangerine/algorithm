class Solution {
    public int solution(String myString, String pat) {
        int patInd = pat.length();
        int answer = 0;
        for(int i=0;i<=myString.length()-pat.length();i++){
            if(myString.substring(i,patInd).equals(pat)) answer++;
            patInd++;
        }
        return answer;
    }
}