class Solution {
    public String solution(String my_string, String alp) {
        String str[] = my_string.split("");
        for(int i=0; i<my_string.length(); i++){
            if(str[i].equals(alp))
                str[i] = str[i].toUpperCase();
        }
        my_string="";
        for(String i : str)
            my_string += i;
        return my_string;
        }
}