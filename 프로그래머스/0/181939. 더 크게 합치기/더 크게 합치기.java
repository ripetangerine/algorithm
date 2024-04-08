class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String result0 = a+""+b;
        String result1 = b+""+a;
        
        if(Integer.parseInt(result0)>=Integer.parseInt(result1)){
            answer = Integer.parseInt(result0);
        }else{
            answer = Integer.parseInt(result1);
        }
        return answer;
    }
}