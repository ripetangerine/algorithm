class Solution {
    public int solution(String myString, String pat) {
        
        int ans = 0;
        int patIdx = pat.length(); 
        
        for(int i=0; i<=myString.length()-pat.length(); i++){
            if(myString.substring(i,patIdx).contains(pat)) ans++;
            patIdx++;
        }
        return ans;
    }
}