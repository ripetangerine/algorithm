import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int intArr[] = new int[N];
        for(int i=0; i<N; i++){
            intArr[i]=in.nextInt();
        }
        int K = in.nextInt();
        int sum=0;
        for(int i=0; i<N; i++){
            if(intArr[i]==K) sum++;
        }
        System.out.println(sum);
    }
}