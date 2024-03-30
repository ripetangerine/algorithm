import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int H=sc.nextInt();
        int M=sc.nextInt();
        
        sc.close();
        //시간을 입력 -> 45분 일찍 출력
        
        M-=45;
        
        if (M<0){
            H--;
            M+=60;
        }
        if (H<0){
            H = 23;
            
        }
        System.out.print(H+" "+M);
    }
}