class Solution {
    public int solution(String s) {
        int answer = 0;
        int res =0;
        if(s.startsWith("+") ){
            res = Integer.parseInt(s.substring(1,s.length()));
            answer = res;
        }
        else if(s.startsWith("-")){
            res = Integer.parseInt(s.substring(1,s.length()));
            answer=-res;
        }
        else{
            res = Integer.parseInt(s.substring(0,s.length()));
            answer = res;

        }
        System.out.println(answer);
        return answer;
    }
}