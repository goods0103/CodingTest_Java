class Solution {
    public int solution(int n) {
        int answer = 0;
		int num1 = n-1;
		
		for(int i=2; i<=num1; i++){
			if(num1%i==0){
				answer =i;
				break;
			}
		}
		
        return answer;
    }
}