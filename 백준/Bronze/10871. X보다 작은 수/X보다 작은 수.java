import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int X = in.nextInt();
        int A[] = new int[N];
        int i= 0; 
        for(; i<N; i++){
            A[i]=in.nextInt();
        }
        for(i=0; i<N; i++){
            if(A[i]<X){
                System.out.print(A[i]+" ");
            }
        }      
    }
}