import java.util.Scanner;
class Solution {
    public int solution(int[] num_list) {
     
        Scanner in = new Scanner(System.in);
        int answer = 0,odd=0,even=0;
        
        for(int i=0; i<num_list.length; i++){
           
            if(i%2==0) even += num_list[i];
            else odd += num_list[i];
        }
        
        answer = (odd>=even)? odd: even; 
        
        return answer;
    }
}