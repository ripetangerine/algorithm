class Solution {
    public int[] solution(int n, int[] numlist) {
        int cnt2=0;
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n==0) 
                cnt2++;
        }
        int result[] = new int[cnt2];
        int cnt=0;
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n==0){
                result[cnt]=numlist[i];
                cnt++;
            }
        }
        return result;
    }
}