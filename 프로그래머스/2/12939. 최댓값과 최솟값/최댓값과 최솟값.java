import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        int max = Arrays.stream(s.split(" "))
            .mapToInt(Integer::parseInt).max().getAsInt();
        int min = Arrays.stream(s.split(" "))
            .mapToInt(Integer::parseInt).min().getAsInt();
        answer = min +" "+max;
        return answer;
    }
}