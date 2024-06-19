class Solution {
    public int solution(String my_string, String is_suffix) {
        int ans=0,cnt=0;
        if(my_string.length()<is_suffix.length())
            ans=0;
        else{
            int index = 0;
            for(int i=my_string.length()-is_suffix.length(); i<my_string.length(); i++){
                if(my_string.charAt(i)==is_suffix.charAt(index))
                    cnt++;
                index++;
            }
        }
        return (cnt==is_suffix.length())?1:0;
    }
}