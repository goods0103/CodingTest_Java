import java.util.*;
class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s = sb.toString();
        answer = Arrays.stream(s.split("")).mapToInt(Integer::parseInt).toArray();       
        return answer;
    }
}