import java.util.*;
class Solution {
    public int[] solution(String s) {
        int len = s.length();
        int[] answer = new int[len];
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<len; i++){
            char c = s.charAt(i);
            // 자신과 가장 가까운 곳에 있는 같은 글자가 어디 있는지 알고 싶습니다.
            if(stack.contains(c)){
                int idx = stack.lastIndexOf(c);
                answer[i] = i-idx;
            }
            else{
                answer[i] = -1;
            }
            stack.push(c);
            // System.out.println(answer[i]);
        }
        return answer;
    }
}