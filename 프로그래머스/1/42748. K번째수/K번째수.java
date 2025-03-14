import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        Integer [] arr2 ={};
        ArrayList <Integer> arr = new ArrayList<>();
        int start = 0;
        int end = 0;
        int ans = 0;
        for(int i=0; i<commands.length; i++){
            //array 자르기 및 정렬
            //array의 n번째값 구하기
            // System.out.println(commands[i][t]);
            start = commands[i][0] -1;
            end = commands[i][1] -1;
            ans = commands[i][2] -1;
            for(int k=start; k<=end; k++){
                arr.add(array[k]);
            }
            // System.out.println(arr.toString());
            arr2 = arr.toArray(new Integer[arr.size()]);
            Arrays.sort(arr2);
            answer[i]=arr2[ans];
            arr.clear();
        }
        
        return answer;
    }
}