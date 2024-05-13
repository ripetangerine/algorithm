import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        char str[] = new char[1001];
        String word = in.next();
        int index = in.nextInt();
        
        for(int i=0; i<word.length(); i++ ){
            str[i] = word.charAt(i);
        }
        System.out.println(str[index-1]);
    }
}