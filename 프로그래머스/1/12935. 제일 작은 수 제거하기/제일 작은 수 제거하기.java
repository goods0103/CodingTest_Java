import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int[] answer = new int[len];
        List<Integer> list = new ArrayList<>();
        int min = arr[0];
        if(len==1){
            answer[0] = -1;
        }
        else{
        //최솟값 구하기
        for(int a : arr){
            min = Math.min(a, min);
        }
        // System.out.println(min);
        //제거
        for(int a : arr){
            if(a!=min){
                list.add(a);
            }
        }
        //list to array
        answer = list.stream().mapToInt(i->i).toArray();
        }
        
        return answer;
    }
}
