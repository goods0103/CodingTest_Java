class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        int idx = -1;
        for(int i=0; i<len; i++){
            char c = s.charAt(i);
            if(c==' '){
                idx = -1;
                sb.append(' ');
            }
            else{
                idx++;
                if(idx%2==0){
                    sb.append(Character.toUpperCase(c));
                }
                else{
                    sb.append(Character.toLowerCase(c));
                }
            }
        }
        answer = sb.toString();
        System.out.println(answer);
        return answer;
    }
}