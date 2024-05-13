import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String word = br.readLine();
        int N = Integer.parseInt(br.readLine())-1;
        
        br.close();
        
        System.out.print(word.charAt(N));
        
        
    }
}