class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        char ch[] = my_string.toCharArray();
        
        for(int[] query : queries){
            int start = query[0];
            int end = query[1];
            
            while(start<end){
                char tmp = ch[start];
                ch[start] = ch[end];
                ch[end] = tmp;
                
                start++;
                end--;
            }
        }
        
        return new String(ch);
    }
}