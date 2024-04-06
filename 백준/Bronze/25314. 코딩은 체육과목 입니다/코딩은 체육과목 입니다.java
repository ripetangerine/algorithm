import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String LongN = "";
        in.close();
        
        for(int i=1; i<=N/4; i++){ 
            LongN += "long ";
        }
        System.out.println(LongN+"int");
        
    }
}