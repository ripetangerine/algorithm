class Solution {
    public int solution(String[] strArr) {
        int len_cnt[] = new int[31];
        for(int i=0; i<31; i++) len_cnt[i]=0;
        
        for(int i=0; i<strArr.length; i++){
            len_cnt[strArr[i].length()]++;
        }
        int max = len_cnt[0];
        for(int i=0; i<len_cnt.length; i++){
            if(max<len_cnt[i])
                max=len_cnt[i];
        }
        return max;
    }
}