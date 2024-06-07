
class Solution {
    public String solution(String letter) {
        String answer="";
        String[] morse = { ".-" ,"-...","-.-.","-..",".","..-.",
            "--.","....","..",".---","-.-",".-..",
            "--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-",
            "-.--","--.."};
        
        String[] spli = letter.split(" "); //letter를 조각낸 값을 spli배열에 할당
                
        for(String s : spli){ //spli을 순환
            for(int i=0; i<morse.length; i++){ 
                if(s.equals(morse[i])){
                    answer += Character.toString(i+'a');
                    break;
                }
            }
        }
        return answer;
    }
}