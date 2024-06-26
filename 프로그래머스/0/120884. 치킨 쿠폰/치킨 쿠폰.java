class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int rest = 0;
        do{
            rest = chicken%10;
            chicken /= 10;
            answer += chicken; 
            chicken += rest; 
        }while(chicken>=10);
        
        return answer; 
    }
}