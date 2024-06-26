class Solution {
    public int solution(int[][] dots) {
        int a=0;
        int b=0;
        for(int i=0; i<dots.length; i++){
            if(dots[0][0] == dots[i][0])
                a = dots[i][1];
            else 
                b = dots[i][0];
        }
        a = Math.abs(dots[0][1]-a);
        b = Math.abs(dots[0][0]-b);
        return a*b;
    }
}