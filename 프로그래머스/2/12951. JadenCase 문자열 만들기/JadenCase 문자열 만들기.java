import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        boolean state = false;
        //전부소문자로변환
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                sb.append(' ');
                state = false;
                continue;                 
            }
            else if(state != false){
                sb.append(Character.toString(ch).toLowerCase());
                continue;
            }
            sb.append(Character.toString(ch).toUpperCase());
            state = true;
            

            
        }
        answer = sb.toString();
    
		
        return answer;
    }
}
