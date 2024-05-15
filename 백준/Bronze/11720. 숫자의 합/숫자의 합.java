import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum=0;
        String str = br.readLine();
        for(int i=0; i<N; i++){
            sum += str.charAt(i)-'0' ;
        }
        System.out.println(sum);
        
    }
}