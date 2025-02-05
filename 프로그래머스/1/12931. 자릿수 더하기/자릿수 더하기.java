import java.util.*;

public class Solution {
    public int solution(int n) {
		int answer = 0;
        String digits = Integer.toString(n);
        for(int i=0; i<digits.length(); i++){
            int mid = digits.charAt(i)-'0';
            answer += mid;
        }
		return answer;
    }
}