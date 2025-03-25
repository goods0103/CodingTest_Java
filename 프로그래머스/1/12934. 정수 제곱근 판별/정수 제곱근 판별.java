import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        Object n2 = Math.sqrt(n);        
        if(Math.sqrt(n)%1 == 0){
            int n3 = (int)Double.parseDouble(String.valueOf(n2));
            answer = (long)(Math.pow(n3+1,2)); 
        }
        else{
            answer = -1;
        }
        return answer;
    }
}