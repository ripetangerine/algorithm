import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        String word= in.next();
        int N = in.nextInt();
        
        System.out.print(word.charAt(N-1));
    }
}