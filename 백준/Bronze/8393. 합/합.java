import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.close();
        int num = 0;
        
        for(int i =1; i<=N; ++i){
        num += i;
        }
        System.out.println(num);
    }
}