import java.util.Scanner; 
public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int N = in.nextInt();
        int sum=0,total=0;
        int a=0,b=0; 
        for(int i=1; i<=N; i++){
            a=in.nextInt();
            b=in.nextInt();
            total += a*b;
        }
        if(total==X) System.out.println("Yes");
        else System.out.println("No");
        
    }
}