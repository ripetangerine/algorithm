class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int len = 0,cnt = 0;
        for(int i=0; i<todo_list.length; i++){
            if(finished[i]==false) cnt ++;
        }
        String answer[] = new String[cnt];
        cnt = 0;
        for(int i=0; i<todo_list.length; i++){
            if(finished[i]==false){
                answer[cnt] = todo_list[i];
                cnt++;
            }
        }
        return answer;
    }
}