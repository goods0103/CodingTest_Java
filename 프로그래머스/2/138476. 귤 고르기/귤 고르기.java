import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int count = 0;
        //귤크기배열 sort()
        Arrays.sort(tangerine);
        //귤 크기별 개수 구하기
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<tangerine.length; i++){
            if(i>=1 && tangerine[i-1]!=tangerine[i]){
                list.add(count);
                count = 0;
            }
            if(i==tangerine.length-1){
                list.add(count+1);
                count = 0;
            }
            count++;
        }
        //개수>=k일경우 1 break;
        //개수 < k일경우 크기별개수의합 = k 인것중 종류가 젤적은것 리턴
        Collections.sort(list);
        for(int i=list.size()-1; i>=0; i--){
            k -= list.get(i);
            answer ++;    
            if(k <= 0) break;
        }
        System.out.println("답: " + answer);
        return answer;
    }
}