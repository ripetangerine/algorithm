import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int alpa[] = new int[26];
        //alpa의 모든 배열 방에 -1 할당
        for(int i=0; i<alpa.length; i++)
            alpa[i] = -1;
                
        //for로 배회하며 i의 위치를 alpa에 할당 
        for(int i=0; i<S.length(); i++){
            char ch = S.charAt(i);
            if(alpa[ch-'a']== -1) alpa[ch-'a'] = i;
        }
        for(int num : alpa){
            System.out.print(num+" ");
        }
    }
}