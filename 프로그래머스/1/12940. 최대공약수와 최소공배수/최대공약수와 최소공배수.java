class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        
        int max = 0; //최대공약수 
        
        //최소 공약수 
        for(int i=1; i<=n&&i<=m;i++){
            if(m%i==0&&n%i==0) max = i;
        }
        
        int min = (n*m)/max;
        
        return new int[]{max,min};
    }
}