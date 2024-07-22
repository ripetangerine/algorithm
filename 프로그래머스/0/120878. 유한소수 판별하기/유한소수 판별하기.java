class Solution {
    public int solution(int a, int b) {
        for(int i=2; i<=a&&i<=b; i++){
            while(a%i==0 && b%i==0){
                a/=i;
                b/=i;
            }
        }
        
        boolean flag = true;
        while(b>1){
            if(b%2==0)
                b/=2;
            else if(b%5==0)
                b/=5;
            else{
                flag = false;
                break;
            }
        }
        return flag?1:2;
    }
}