class Solution {
    public int solution(int num, int k) {
        String numArr[] = String.valueOf(num).split("");
        int ans = -1;
        for(int i=0; i<numArr.length; i++){
            if(Integer.parseInt(numArr[i])==k){
                ans = i;
                return ans+1;
            }
        }
        return ans;
    }
}