class Solution {
    public String solution(String[] id_pw, String[][] db) {
        int cnt = 0;
        int index = 0; 
        int sp = 0; 
        
        for(int i=0; i<db.length; i++){
            for(int j=0; j<db[0].length; j++){
                if(id_pw[j].equals(db[i][j])){
                    index = j; 
                    cnt++;
                }
            }
            if(cnt==2) break;
            if(cnt==1 && index==0){
                sp = 1;
            }
            cnt=0;
        }
        
        return cnt==2? "login": sp==1? "wrong pw": "fail";  
    }
}