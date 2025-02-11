import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<numbers.length;i++){
            for(int t=i+1; t<numbers.length;t++){
                if(!arr.contains(numbers[i]+numbers[t])){
                    arr.add(numbers[i]+numbers[t]);
                }        
            }
        }
        answer = new int[arr.size()];
        for(int a=0; a<answer.length; a++){
            answer[a]=arr.get(a);
        }
        Arrays.sort(answer);
        System.out.println(arr);
        return answer;
    }
}