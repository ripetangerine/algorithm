import java.util.Scanner; 

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a,b;
        
        for(int i=1; i<=n; i++){
            a=in.nextInt();
            b=in.nextInt();
            
            System.out.println("Case #"+i+": "+(a+b));
        }
        in.close();
    }
}