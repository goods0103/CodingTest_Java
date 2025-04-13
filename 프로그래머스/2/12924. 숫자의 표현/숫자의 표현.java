class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        for(int i=1; i<=n/2; i++){
            sum = i;
            for(int t=i+1; t<=(n/2)+1; t++){
                sum+=t;
                if(sum == n){
                    answer++;
                    break;
                }
                else if(sum > n) break;
            }
        }
        answer+=1;
        return answer;
    }
}