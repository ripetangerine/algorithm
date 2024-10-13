import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String arr[] = new String[5];
        int max = 0;
        
        for(int i=0; i<arr.length; i++){
            arr[i] = in.next();
            if(max<arr[i].length()) max = arr[i].length();
            
        }
        
        String answer = "";
        
        for(int i=0; i<max; i++){
            for(int j=0; j<5; j++){
                if(i<arr[j].length()) answer += arr[j].charAt(i);
            }
        }
        
        System.out.println(answer); 
    }
}