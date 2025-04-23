public class Solution {
    public int solution(int n) {
        int ans = 0;
        //n%2==0이 아닐때까지 계속 나누고 k=n/2;
        //n%2==1 이 될때 count++;
        //다시 k를 2로나눈다
        //반복
        int count = 0;
        int quotient = n/2;
        if(n%2==1){
            count++;
        }
        while(true){
            if(quotient==0){
                break;
            }
            else if(quotient%2==0){
                quotient/=2;
            }
            else{
                quotient/=2;
                count++;
            }
        }
        // System.out.println("count "+count);
        ans = count;    

        return ans;
    }
}