class Solution {
    public String[] solution(String[] str_list) {
        char flag = 'd'; //d:default(없음) , l:왼쪽 문자열, r:오른쪽 문자열
        int len = 0;
        String answer[];
        
        //l,r,d를 판별
        for(int i=0; i<str_list.length; i++){
            if(str_list[i].equals("l")){
                flag='l';
                len = i;
                break;
            }
            else if(str_list[i].equals("r")){
                flag='r';
                len = i;
                break;
            }
        }
        if(flag=='l' && str_list.length>2){
            answer = new String[len];
            for(int i=0; i<answer.length; i++){
                answer[i] = str_list[i];
            }
        }
        else if(flag=='r' && str_list.length>2){
            answer = new String[str_list.length-(len+1)];
            int index = 0;
            for(int i=len+1; i<str_list.length; i++){
                answer[index++] = str_list[i];
            }
        }
        else{
            answer = new String[]{};
        }
        return answer;
    }
}