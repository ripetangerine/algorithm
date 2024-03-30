/*1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.

같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.*/

import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        in.close();
        
        if (a==b&&a==c){
            System.out.print(10000+a*1000);
        }
        else if (a==b&&a!=c || a==c&&a!=b){
            System.out.print(1000+a*100);
        }
        else if(b==c&&b!=a){
            System.out.print(1000+b*100);
        }
        else {
            int max =a;
            if (max<b) max = b;
            if (max<c) max = c;
            System.out.println(max*100);
             
        }
           
    }
}