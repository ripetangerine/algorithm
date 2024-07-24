class Solution {
    public boolean solution(int x) {
        int tmp = x;
        int num = 0;
        while(tmp>0){
            num += tmp%10;
            tmp/=10;
        }
        
        return x%num==0;
    }
}