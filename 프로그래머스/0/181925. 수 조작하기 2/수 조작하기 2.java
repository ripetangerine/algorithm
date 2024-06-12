class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int []sol = new int[numLog.length];
        for(int i=0; i<numLog.length-1; i++){
            int temp = numLog[i+1]-numLog[i];
            switch(temp){
                case 1: answer += "w"; break;
                case -1: answer += "s"; break;
                case 10: answer += "d"; break;
                case -10: answer += "a"; break;
            }
        }
        return answer;
    }
}