import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            for(int j=i; j<=i; j++){
                System.out.print("*".repeat(j));
            }
            System.out.println();
        }
    }
}