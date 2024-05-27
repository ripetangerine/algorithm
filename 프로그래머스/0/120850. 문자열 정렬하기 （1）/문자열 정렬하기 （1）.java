import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        char spli[] = my_string.toCharArray();
        int cnt = 0;
        
        for(int i=0; i<my_string.length(); i++){
            if('0'<=spli[i] && spli[i] <='9'){
                cnt ++; 
            }
        }
        int answer[] = new int[cnt]; 
        
        cnt = 0;
        for(int i=0; i<my_string.length(); i++){
            if('0'<=spli[i] && spli[i]<='9'){
                answer[cnt] = (int)(my_string.charAt(i)-'0');
                cnt ++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}