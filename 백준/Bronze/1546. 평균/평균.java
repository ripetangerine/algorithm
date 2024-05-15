import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int max;
        double aver,add=0;
        int arr[]= new int[N];
        
        for(int i=0; i<N; i++){
            arr[i]=in.nextInt();
        }
        max = arr[0];
        for(int i=1; i<N; i++){
            if(arr[i]>max) max = arr[i];
        }
        for(int i=0; i<N; i++){
            add += ((double)arr[i]/max)*100;
        }
        aver = add/N;
        System.out.println(aver);
        
    }
}