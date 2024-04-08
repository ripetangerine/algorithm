class Solution {
    public int solution(int a, int b) {
        
        int answer = 0;
        String str = a+""+b;
        int inte = 2*a*b;
        if(inte<=Integer.parseInt(str)){
            answer = Integer.parseInt(str);
        }else{
            answer = inte;
        }
        
        
       
        return answer;
    }
}