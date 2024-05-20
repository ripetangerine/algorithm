class Solution {
    public int[] solution(int[] num_list) {
        int odd=0,evn=0;
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0) evn++;
            else odd++;
        }
        int add[]={evn,odd};
        return add;
    }
}