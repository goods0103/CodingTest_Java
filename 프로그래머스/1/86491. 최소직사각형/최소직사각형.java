import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max =0;
        int min =1000;
        int minmax = 0;
        ArrayList<Integer> arrmin = new ArrayList<>();
        for(int i=0; i<sizes.length; i++){
            for(int k=0; k<sizes[0].length; k++){
                max = Math.max(max,sizes[i][k]);
                min = Math.min(min,sizes[i][k]);
                // System.out.println(min);
            }
            minmax = Math.max(min,minmax);
            min = 1000;
        }
        // System.out.println(max);
        // System.out.println(minmax);
        answer = minmax*max;
        return answer;
    }
}