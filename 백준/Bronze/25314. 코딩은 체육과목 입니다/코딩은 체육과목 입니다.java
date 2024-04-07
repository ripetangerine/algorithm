import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        String str ="";
        
        int i = 1;
        for(; i<=N/4; i++){
            str += "long ";
            
        }
        System.out.println(str+"int");
        in.close();
    }
}