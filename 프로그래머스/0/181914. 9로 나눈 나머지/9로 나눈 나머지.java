class Solution {
    public int solution(String number) {
        int seat = 0; 
        for(int i=0; i<number.length(); i++)
            seat += number.charAt(i)-'0';
        return seat%9;
    }
}