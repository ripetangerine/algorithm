class Solution {
    public int solution(int order) {
        String num[] = String.valueOf(order).split("");
        int answer = 0;
        for(int i=0; i<num.length; i++){
            if(Integer.parseInt(num[i])==3 || Integer.parseInt(num[i])==6 || Integer.parseInt(num[i]) == 9){
                answer ++;
            }
        }
        return answer;
    }
}