import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String to = in.nextLine();
        String num1 = ""+to.charAt(2)+to.charAt(1)+to.charAt(0);
        String num2 = ""+to.charAt(6)+to.charAt(5)+to.charAt(4);
        
        int A = Integer.parseInt(num1);
        int B = Integer.parseInt(num2);
        
        if(A>B) System.out.print(A);
        else System.out.print(B);
    }
}