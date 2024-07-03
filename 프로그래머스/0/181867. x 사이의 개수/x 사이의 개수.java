class Solution {
    public int[] solution(String myString) {
        String arr[] = myString.split("x");
        int cnt[] = new int[myString.charAt(myString.length()-1)=='x'? arr.length+1: arr.length ];
        
        for(int i=0; i<arr.length; i++){
            cnt[i] = arr[i].length();
        }
        
        return cnt;
        
    }
}