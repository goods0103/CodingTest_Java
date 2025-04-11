import java.util.*;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        long res = 0;
        long pvalue = Long.parseLong(p);
        for(int i=0; i<t.length()-len+1; i++){
            res = Long.parseLong(t.substring(i,len+i));
            System.out.println(res);
            if(res<=pvalue){
                answer++;
            }
        }
        return answer;
    }
}