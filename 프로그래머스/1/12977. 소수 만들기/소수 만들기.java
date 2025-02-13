class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int count = 0;
        int temp = 0;
		for(int i=0; i<nums.length; i++){
			for(int a=i+1; a<nums.length;a++){
				for(int b=a+1; b<nums.length;b++){
					temp = nums[i]+nums[a]+nums[b];
                    for(int c=2;c<temp/2;c++){
                        if(temp%c==0){
                            count++;
                            break;     
                        }
                    }
                    if(count==0){
                        answer+=1;
                    }
                    count =0;
				}
			}
		}
        return answer;
    }
}
