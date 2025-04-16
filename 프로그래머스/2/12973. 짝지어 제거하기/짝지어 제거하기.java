import java.util.*;
class Solution
{
    public int solution(String s)
    {
        // 의 순서로 문자열을 모두 제거할 수 있으므로 1을 반환합니다.
        int answer = 1;
        // 먼저 문자열에서 같은 알파벳이 2개 붙어 있는 짝을 찾습니다. 그다음, 그 둘을 제거한 뒤, 
        // 앞뒤로 문자열을 이어 붙입니다. 이 과정을 반복해서 문자열을 
        // 모두 제거한다면 짝지어 제거하기가 종료됩니다. 문자열 S가 주어졌을 때, 
        Stack<Character> stack = new Stack<>();
        int len = s.length();
        for(int i=0; i<len; i++){
            if(stack.empty()==false && stack.peek().equals(s.charAt(i))){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        // 문자열이 남아있지만 짝지어 제거할 수 있는 문자열이 더 이상 존재하지 않기 때문에 0을 반환합니다.
        if(!stack.empty()){
            answer = 0;
        } 
        return answer;
    }
}