class Solution {
    public int solution(String my_string, String is_prefix) {
        int ans=0;
        String my[] = my_string.split("");
        String is[] = is_prefix.split("");
        
        int cnt=0;
        for(int i=0; i<is.length; i++){
            if(is[i].equals(my[i])) cnt++;
            if(is.length>my.length)
                break;
        }
        if(is.length==cnt) ans = 1;
        else ans = 0;
        return ans;
    }
}