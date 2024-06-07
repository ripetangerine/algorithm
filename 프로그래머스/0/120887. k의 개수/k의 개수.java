class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int n=i; n<=j; n++){ //i 부터 j까지의 for문 
            String S = String.valueOf(n); //S에 n이라는 수를 문자열화
            String sp[] = S.split(""); // S 속 수를 찢어놓음. 
            
            for(String cir : sp){ //sp를 순환
                if(cir.equals(String.valueOf(k))) // k과 같다면 
                    answer++; // answer를 증가한다. 
            }
        }
        
        return answer;
    }
}