import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        double add=0,max;
        double arr[]= new double[N];
        
        for(int i=0; i<N; i++){
            arr[i]=in.nextDouble();
        }
        max = arr[0];
        for(int i=1; i<N; i++){
            if(arr[i]>max) max = arr[i];
        }
        for(int i=0; i<N; i++){
            add += (arr[i]/max)*100;
        }
        System.out.println(add/N);
        
    }
}