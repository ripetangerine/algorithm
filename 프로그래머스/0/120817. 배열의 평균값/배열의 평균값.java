class Solution {
    public double solution(int[] numbers) {
        double aver;
        int add=0;
        for(int i=0; i<numbers.length; i++){
            add+=numbers[i];
        }
        aver = (double)add/numbers.length;
        return aver;
    }
}