import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        
        int cnt=0,result=0;
        
        for(int i=1; i<=N; i++){
            if(N%i==0){
                cnt++;
            }
            if(cnt==K){
                result = i;
                break;
            }
        }
        //if(cnt==N-1) System.out.println("0");
        System.out.println(result);
    }
}