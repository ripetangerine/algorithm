class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        String add = "";
        for(int i=0; i<array.length; i++){ //array의 배열을 String으로 합한 것
            add += String.valueOf(array[i]);
        }
        
        String[] add_split = add.split(""); // add를 조각조각 나눈다. 
        
        for(String s : add_split){
            if(s.equals("7"))
                answer ++;
        }
        
        return answer;
    }
}