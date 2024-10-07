import java.util.*; 
class Solution {
    boolean solution(String s) {
        Stack<String> stack = new Stack<>();
                
        for(int i=0;i<s.length(); i++){
            if(stack.isEmpty()||s.charAt(i)=='(') stack.push(Character.toString(s.charAt(i)));
            else stack.pop();
        }
        
        if(stack.isEmpty()) return true;
        else return false;
    }
}