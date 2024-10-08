import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int tempNum; 
        while(true){
            tempNum = in.nextInt();
            if(tempNum == -1) break;
            list.add(tempNum);
        }
        ///////////////////////////////////////////

        int index = 0,target;
        tempNum = 0;
        for(int i=0; i<list.size(); i++){
            target = list.get(index);
            
            for(int j=1; j<target; j++){
                if(target%j==0){
                    tempNum += j;
                } 
            }
            if(target==tempNum) printRtn(target, list.get(list.size()-1));
            else System.out.println(target+" is NOT perfect.");
            tempNum = 0;
            index++;
        }

        //System.out.println("process end!");
    }
    static void printRtn(int num, int limit){
        System.out.print(num+" = ");
        for(int i=1; i<num; i++){
            if(num%i==0 && i==num/2) System.out.print(i);
            else if(num%i==0) System.out.print(i+" + ");
        }
        System.out.println();
    }
}