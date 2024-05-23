class Solution {
    public int[] solution(int n, int[] numlist) {
        int cnt=0;
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n==0) 
                cnt++;
        }
        int result[] = new int[cnt];
        cnt=0;
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n==0){
                result[cnt]=numlist[i];
                cnt++;
            }
        }
        return result;
    }
}