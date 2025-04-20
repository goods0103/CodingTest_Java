class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int len = food.length;
        //각 배열의 원소가 짝수인가
        for(int i=1; i<len; i++){
            int mok = food[i]/2;
            for(int t=0; t<mok; t++){
                sb.append(i);                    
            }
        }
        String reverse = sb.reverse().toString();
        sb.reverse();
        sb.append(0);
        sb.append(reverse);
        
        answer = sb.toString();
        // System.out.println(answer);
        return answer;
    }
}