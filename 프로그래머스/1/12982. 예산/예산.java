import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum =0;
        int count =0;
        int [] sortArr = d;
        Arrays.sort(sortArr);
        for(int i : sortArr){
            if(sum+i<=budget){
                sum+=i;
                System.out.println(i);
                System.out.println("sum" + sum);
                
                count++;
            }
        }
        answer=count;
        return answer;
    }
}