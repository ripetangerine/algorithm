import java.util.HashSet;
class Solution {
    public int solution(int[] numbers) {
        HashSet <Integer> set = new HashSet<> ();
        
        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                if(numbers[i]==numbers[j]) continue;
                set.add(numbers[i]*numbers[j]);
            }
        }
        int max = numbers[0]*numbers[1];
        for(int num : set){
            if(max < num){
                max = num;
            }
        }
        return max;
    }
}