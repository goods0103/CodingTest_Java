import java.util.ArrayList;
class Solution {
    public int solution(int n) {
        int answer = 0;
        String val = "";
        while(n!=0){
            val += n%3;
            n /=3;
        }
        answer = Integer.parseInt(val,3);
        return answer;
    }
}