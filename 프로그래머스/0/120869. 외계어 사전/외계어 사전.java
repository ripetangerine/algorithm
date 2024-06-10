class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer=2,cnt=0;
        for(int i =0; i<dic.length; i++){
            cnt=0;
            for(int j=0; j<spell.length; j++){
                if(dic[i].contains(spell[j]))
                    cnt ++;
                if(cnt==spell.length) answer = 1;
            }
        }
        return answer;
    }
}