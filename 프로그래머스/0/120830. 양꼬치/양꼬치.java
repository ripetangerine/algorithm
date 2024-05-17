class Solution {
    public int solution(int n, int k) {
        if(n/10>0){
            int free=n/10;
            k-=free;
        }
        int total = 12000*n+2000*k; 
        
        return total; 
    }
}