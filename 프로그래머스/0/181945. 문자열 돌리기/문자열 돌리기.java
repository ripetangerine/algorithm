import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch[] = new char[str.length()];
        for(int i=0; i<str.length(); i++){
            ch[i]=str.charAt(i);
            System.out.println(ch[i]);
        }

        
    }
}