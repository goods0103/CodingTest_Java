import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> answerStack = new Stack<>();
        for(int i : arr){
            if(answerStack.size()==0 || answerStack.peek()!=i){
                answerStack.push(i);
            }
        }
        int [] answer = new int[answerStack.size()];
        for(int i=0; i<answer.length;i++){
            answer[i] = answerStack.elementAt(i);
        }
        
        return answer;
    }
}