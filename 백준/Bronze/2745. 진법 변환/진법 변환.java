import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String num = in.next();
        int bin = in.nextInt();
        
        System.out.println(Integer.parseInt(num,bin));
        
    }
}