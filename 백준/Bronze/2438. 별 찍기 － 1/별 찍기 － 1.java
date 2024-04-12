import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int sum = 0;
        in.close();
        
        for(int i=1; i<=N; i++){
            sum += i;
            System.out.println("*".repeat(i));
        }
    
    
    }
}