class Solution {
    public int solution(String binomial) {
        
        String sp[] = binomial.split(" ");
        int a = Integer.parseInt(sp[0]);
        int b = Integer.parseInt(sp[2]);   
        
        int answer = 0;
        
        switch(sp[1]){
            case "+": answer=a+b; break;
            case "-": answer=a-b; break;
            case "*": answer=a*b; break;
        }
        
        return answer; 
    }
}