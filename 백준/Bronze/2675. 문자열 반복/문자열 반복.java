import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        for(int i=0; i<T; i++){
            int rep = in.nextInt();
            String str = in.next();
            
            for(int j=0; j<str.length(); j++){
                for(int l=0; l<rep; l++){
                    System.out.print(str.charAt(j));
                }

            }
            System.out.println();
        }
// 
    }
}