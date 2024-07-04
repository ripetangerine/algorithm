class Solution {
    public String[] solution(String[] strArr) {
        int cnt=0;
        for(int i=0; i<strArr.length; i++){
            if(strArr[i].contains("ad"))
                cnt++;
        }
        String answer[] = new String[strArr.length-cnt];
        cnt = 0;
        for(int i=0; i<strArr.length; i++){
            if(strArr[i].contains("ad"))
                continue; 
            else
                answer[cnt++] = strArr[i];
        }
        return answer;
    }
}