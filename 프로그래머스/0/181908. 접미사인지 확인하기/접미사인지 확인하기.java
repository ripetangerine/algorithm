class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int index = my_string.length() - is_suffix.length();
        
        for(int i=0; i<is_suffix.length(); i++){
            if(index<0) break;
            else{
                if(my_string.charAt(index) == is_suffix.charAt(i)){
                    answer ++;
                    
                    System.out.println(my_string.charAt(index)+" "+is_suffix.charAt(i));
                }
                index ++;
            }
        }
        
        return (answer == is_suffix.length()) ? 1: 0;
    }
}