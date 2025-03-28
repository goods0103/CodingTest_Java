class Solution {
    public int solution(int[] number) {
        int answer = 0;
		for(int i=0; i<number.length-2; i++){
			for(int a=i+1; a<number.length; a++){
				for(int b=a+1; b<number.length; b++){
					if(number[i]+number[a]+number[b] == 0){
						answer++;
					}
				}	
			}
		}
        return answer;
    }
}