import java.util.Scanner; 
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int king = 1-in.nextInt();
        int queen = 1-in.nextInt();
        int look = 2-in.nextInt();
        int bish = 2-in.nextInt();
        int kigh = 2-in.nextInt();
        int pone = 8-in.nextInt();
            
        
        System.out.print(king+" "+queen+" "+look+" "+bish+" "+kigh+" "+pone);
    }
}