import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String [] arr = s.split("");
        String [] arr2 = Arrays.stream(arr)
    .sorted(Comparator.reverseOrder())
    .toArray(String[]::new);
        for(int i=0; i<arr2.length;i++){
            answer = answer.concat(arr2[i]);
        }
        
        return answer;
    }
}