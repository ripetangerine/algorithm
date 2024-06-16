class Solution {
    public String[] solution(String[] names) {
        int len = (names.length%5==0)? names.length/5 : names.length/5+1;
        String ans[] = new String[len];
        int cnt = 0;
        for(int i=0; i<names.length; i+=5){
            ans[cnt] = names[i];
            cnt++;
        }
        return ans;
    }
}