class Solution {
    public int[] solution(int[] num_list, int n) {
        int i;
        int answer[] ;
        
        if(num_list.length%n==0){
            answer=new int[num_list.length/n];
        }
        else{
            answer = new int[num_list.length/n+1];
        }
    
        int inde=0;
        for(i=0; i<num_list.length; i+=n){
            answer[inde++] = num_list[i];
        }
        return answer;
    }
}