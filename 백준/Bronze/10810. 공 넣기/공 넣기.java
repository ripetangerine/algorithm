import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        //배열의 크기 
        int N = in.nextInt();
        //전체 루프
        int M = in.nextInt();
        //** index 0 == 1 
        //배열
        int arr[] = new int[N];
        
        for(int i=0; i<M; i++){
            int start = in.nextInt();
            int end = in.nextInt();
            int mode = in.nextInt();
            for(int s=start-1; s<end; s++){
                arr[s] = mode;
            }
        }
        
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}