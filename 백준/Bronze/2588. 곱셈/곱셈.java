import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner in = new Scanner (System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();
        
        in.close();
        
        System.out.println(a*(b%10)); //1st unit
        System.out.println(a*((b%100)/10)); //2ed
        System.out.println(a*(b/100)); //3rd
        System.out.println(a*b);
        
        
        
        
    }
    
}