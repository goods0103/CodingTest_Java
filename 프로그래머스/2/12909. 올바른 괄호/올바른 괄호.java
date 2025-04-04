import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stk = new Stack<>();
        int len = s.length();
        // if(arr[0].equals(")")) return false;
        // stk.push(arr[0]);
        for(int i=0; i<len; i++){
            if(s.charAt(i)==')'){
                if(stk.empty() || stk.peek() !='('){
                    return false;
                }           
                stk.pop();
            }
            else{
                stk.push('(');
            }
        }
        if(!stk.empty()){
            answer = false;
        }
        // System.out.println(answer);
        return answer;
    }
}