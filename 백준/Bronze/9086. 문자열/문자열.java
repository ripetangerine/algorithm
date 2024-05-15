import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        while(N>0){
            String str = in.next();
            System.out.println(str.charAt(0)+""+str.charAt(str.length()-1));
            N--;
        }
    }
}