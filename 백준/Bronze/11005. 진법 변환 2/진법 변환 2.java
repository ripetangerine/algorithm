import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int bin = in.nextInt();
            
        System.out.println(Integer.toString(number,bin).toUpperCase());
    }
}