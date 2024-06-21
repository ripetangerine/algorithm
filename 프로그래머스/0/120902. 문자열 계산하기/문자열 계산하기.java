class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String sp[] = my_string.split(" ");
        
        answer += Integer.parseInt(sp[0]);
        
        for(int i=1; i<sp.length-1; i++){
            if(sp[i].equals("+"))
                answer += Integer.parseInt(sp[i+1]);
            else if(sp[i].equals("-"))
                answer -= Integer.parseInt(sp[i+1]);
        }
        
        return answer;
    }
}