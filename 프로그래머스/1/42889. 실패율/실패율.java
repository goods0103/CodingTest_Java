import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
		int count =0;
		int man = stages.length;
        HashMap<Integer, Double> map = new HashMap<>();
		//실패율 구하기
		for(int i=1; i<=N;i++){
			for(int t=0; t<stages.length; t++){
				if(i==stages[t]){
					count++;
				}
			}
            if(count==0){
                map.put(i,(double)count);
            }
            else{
                map.put(i, count/(double)man);
            }
            // System.out.println(map.get(i));
			man -=count;
			count = 0;
		}
		//정렬
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((x, y) -> map.get(y).compareTo(map.get(x)));
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}