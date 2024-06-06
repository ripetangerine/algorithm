class Solution {
    public int solution(String my_string) {
        int ans = 0;
        String sp[] = my_string.replaceAll("[a-zA-Z]"," ").split(" ");
        for(String s : sp){
            if(!s.equals(""))
                ans += Integer.parseInt(s);
        }
        return ans;
    }
}