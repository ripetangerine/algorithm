import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int strLength = sc.nextInt(); //문자열 길이
        String str = sc.next(); //문자열
        String answer = ""; //답
        int cnt = strLength-5; 
        
        for(int i=0; i<5; i++){
            answer += str.charAt(cnt);
            cnt++;
            
        }
        System.out.println(answer);
    }
}