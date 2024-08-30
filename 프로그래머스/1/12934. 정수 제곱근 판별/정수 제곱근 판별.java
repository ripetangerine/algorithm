class Solution {
    public long solution(long n) {
        // double Sprt = Math.sq
        return Math.sqrt(n)%1==0?(long)(Math.pow(Math.sqrt(n)+1,2)):-1;
    }
}