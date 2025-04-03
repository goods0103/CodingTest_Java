class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int len = phone_number.length();
        String [] arr = phone_number.split("");
        for(int i=0; i<len; i ++){
            if(i<len-4){
                answer += "*";                 
            }
            else{
                answer +=arr[i];
            }
        }
        // System.out.println(answer);
        return answer;
    }
}