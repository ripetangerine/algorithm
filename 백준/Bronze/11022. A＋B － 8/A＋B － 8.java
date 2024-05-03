import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        int a=0,b=0,c=0;
        for(int i=1; i<=T; i++){
            a=in.nextInt();
            b=in.nextInt();
            c=a+b;
            System.out.println("Case #"+i+": "+a+" + "+b+" = "+c);
        }
        in.close();
    }
}