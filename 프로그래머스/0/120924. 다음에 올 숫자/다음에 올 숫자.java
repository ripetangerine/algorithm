class Solution {
    public int solution(int[] common) {
        
        int gon = 0; 
        int answer = common[common.length-1];
        
        if(common[0]-common[1]==common[1]-common[2]){
            gon = common[1]-common[0];
            answer += gon; 
        }
        else{
            gon = common[1]/common[0];
            answer *= gon; 
        }
        
        return answer; 
        
        
    }
}