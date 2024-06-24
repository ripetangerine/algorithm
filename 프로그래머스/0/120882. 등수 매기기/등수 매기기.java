class Solution {
    public int[] solution(int[][] score) {
        double aver[] = new double[score.length];
        int rank[] = new int[score.length];
        for(int i=0; i<score.length; i++){
            rank[i] = 1;
            for(int j=0; j<2; j++){
                aver[i] += score[i][j]; 
            }
            aver[i] /= (double)2;
        }
        for(int i=0; i<aver.length; i++){
            for(int j=i+1; j<aver.length; j++){
                if(aver[i]<aver[j])
                    rank[i]++;
                else if(aver[i]>aver[j])
                    rank[j]++;
            }
        }
        return rank; 
    }
}