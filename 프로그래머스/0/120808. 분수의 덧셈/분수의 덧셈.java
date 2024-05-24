class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int answer[] = new int[2];
        int numer = numer1*denom2+numer2*denom1;
        int denom = denom1*denom2;
        
        int cnt=0;
        for(int i=1; i<=numer && i<=denom; i++){
            if(numer%i==0 && denom%i==0){
                cnt=i;
            }
        }
        answer[0]=numer/cnt;
        answer[1]=denom/cnt;
        
        return answer;
    }
}