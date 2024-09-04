import java.math.*;
class Solution {
    public String solution(String s) {
        String tmp[] = s.split(" ");
        int arr[] = new int[tmp.length];
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(tmp[i]);
        }
        int max=arr[0],min=arr[0];
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]) max = arr[i];
            else if(min>arr[i]) min = arr[i];
        }
        
        return min+" "+max;
    }
}