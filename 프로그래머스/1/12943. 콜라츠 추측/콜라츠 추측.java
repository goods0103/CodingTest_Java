import java.util.*;
class Solution {
    public int solution(int num) {
        int answer = 0;
		int count = 0;
        long num2 = (long) num;
		while(num2!=1){
			if(num2%2==0){
				num2/=2;
			}
			else{
				num2 = num2*3 + 1;
			}
			count++;
			if(count==500){
			    answer = -1;
				break;
			}
			answer = count;
            
		}
		// if(num2==1){
		// 	answer = count;
		// }
        return answer;
    }
}