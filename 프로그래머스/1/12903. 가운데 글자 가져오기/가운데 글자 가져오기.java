import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        if(len%2==1){
            char ans = s.charAt(len/2);
            answer = String.valueOf(ans);
            
        }
        else{
            answer = String.valueOf(s.charAt(len/2-1)).concat(String.valueOf(s.charAt(len/2)));
        
        }
        return answer;
    }
}