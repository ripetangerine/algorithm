class Solution {
    public String solution(String polynomial) {
        String temp = polynomial.replace(" ","");
        String arr[] = temp.split("\\+");
        
        int x = 0;
        int num = 0;
        String answer = "";
        
        for(int i=0; i<arr.length; i++){
            if(arr[i].contains("x"))
                x += ((arr[i].replace("x","")).equals(""))? 1 : Integer.parseInt(arr[i].replace("x",""));
            else if(!(arr[i].equals(""))){                    num += Integer.parseInt(arr[i]);
            }  
        }
        
        answer += (x==0)? "": (x==1)? "x": x+"x";
        answer += (num==0)? "": (answer.length()>0)? " + "+num : num ;
        
        return answer;
    }
}