import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        ArrayList <Integer> list = new ArrayList<>();
        while(n>0){
            list.add((int)(n%10));
            n/=10;
        }
        Integer [] arr = list.toArray(new Integer [list.size()]);
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i=0; i<arr.length; i++){
            answer += arr[i]*Math.pow(10, arr.length-1-i);
        }
        
        return answer;
    }
}