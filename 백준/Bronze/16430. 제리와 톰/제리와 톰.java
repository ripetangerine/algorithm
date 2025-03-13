import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int up = b-a;
        int down = b;
        System.out.println(up+" "+down);
        
    }
}