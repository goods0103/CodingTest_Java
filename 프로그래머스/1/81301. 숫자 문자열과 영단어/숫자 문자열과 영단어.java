import java.util.*;
import java.lang.*;

class Solution {
    public int solution(String s) {
        // "one4seveneight"
        int answer = 0;
        String []arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i=0;i<arr.length;i++){
            s=s.replaceAll(arr[i], Integer.toString(i));
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}