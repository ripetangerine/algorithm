import java.util.Scanner;
public class Main{
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        int a=0,b=0,c=0;
        for(int i=0; ; i++){
            a=in.nextInt();
            b=in.nextInt();
            c=a+b;
            if(a==0&&b==0) break;
            System.out.print(c);
            System.out.print("\n");   
        }
    }
}