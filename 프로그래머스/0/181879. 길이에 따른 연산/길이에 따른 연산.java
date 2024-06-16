class Solution {
    public int solution(int[] num_list) {
        int sum=0; 
        if(num_list.length>=11){
            sum = 0;
            for(int i=0; i<num_list.length; i++){
                sum += num_list[i];
            }
            return sum;
            
        }else if(num_list.length<=10){
            sum = 1;
            for(int i=0; i<num_list.length; i++){
                sum *= num_list[i];
            }
        }
        return sum; 
    }
}