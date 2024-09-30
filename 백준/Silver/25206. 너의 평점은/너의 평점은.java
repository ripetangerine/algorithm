import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        grade array[] = new grade[20];
        for(int i=0; i<20; i++){
            array[i] = new grade(in.next(), in.nextDouble(), in.next());
        }
        double mul_add = 0;
        double grade_only = 0;
        //계산
        for(int i=0; i<20; i++){
            if(!array[i].char_.equals("P")){
                mul_add += array[i].getCharGrade()*array[i].absolute_rank;
                grade_only += array[i].absolute_rank;
            }
        }
        
        System.out.println(mul_add/grade_only);
        
    }
}

class grade{
    grade(String Study, double absolute_rank, String char_grade){
        this.StudyName = Study; 
        this.absolute_rank = absolute_rank;
        this.char_ = char_grade;
    }
    String StudyName; //OOP
    double absolute_rank; //3.0 학점
    String char_; //A+ 과목평점
    double getCharGrade(){
        double answer = 0.0;
        switch(char_){
            case "A+" : answer = 4.5; break;
            case "A0" : answer = 4.0; break;
            case "B+" : answer = 3.5; break;
            case "B0" : answer = 3.0; break;
            case "C+" : answer = 2.5; break;
            case "C0" : answer = 2.0; break;
            case "D+" : answer = 1.5; break;
            case "D0" : answer = 1.0; break;
            case "F" : answer = 0.0; 
        }
        return answer;
    }
}