import java.util.*;
class Solution {
    public boolean solution(String s) {
        boolean answer = true;
		int count = (int) s.chars().filter(ch -> Character.isDigit(ch)).count();
		if(s.length() == 4 && count==4 || s.length() == 6 && count==6){
		}
        else{
            answer = false;
        }
        return answer;
    }
}
