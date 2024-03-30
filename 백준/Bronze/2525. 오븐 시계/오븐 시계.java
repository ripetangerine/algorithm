import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt(); //시간
        int b = in.nextInt(); //분
        int Mtime = in.nextInt();
        
        in.close();
        
        a +=(Mtime/60);
        b +=(Mtime%60);
        
        if (b>=60){
            a++;
            b-=60;
        }
        if (a>=24){
            a-=24;
        }
        System.out.print(a+" "+b);
        
        
    }
}