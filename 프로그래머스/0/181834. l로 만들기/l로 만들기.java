class Solution {
    public String solution(String myString) {
        //String ans = "";
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i)<'l')
                myString = myString.replace(myString.charAt(i),'l');
        }
        return myString;
    }
}