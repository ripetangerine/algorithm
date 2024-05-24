class Solution {
    public int solution(int n) {
        int result =0;
        for(int i =1; ; i++){
            if((i*6)%n==0){
                result =i;
                break;
            }
        }
        return result;
        
    }
}