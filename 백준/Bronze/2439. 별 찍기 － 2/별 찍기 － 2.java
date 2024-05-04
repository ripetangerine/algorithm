import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.close();
        int a;
        for(int i=1; i<=N; i++){
            a=0;
            a=N-i;
            System.out.print(" ".repeat(a));
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}