import java.util.Scanner; 

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        //가지고 있는 바구니 개수 
        int N = in.nextInt();
        int arr[] = new int[N];
        //각 배열의 1, 2, 3 -- 할당
        for(int i=0; i<N; i++){
            arr[i] = i+1;
        }
        //바꾸려는 횟수
        int M = in.nextInt();
        for(int i=0; i<M; i++){
            //바꿀 요소 입력
            int a = in.nextInt()-1;
            int b = in.nextInt()-1;
            int temp = arr[a]; 
            arr[a] = arr[b];
            arr[b] = temp;
        }
        for(int i:arr)
            System.out.print(i+" ");
    }
}