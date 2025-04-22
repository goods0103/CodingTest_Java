import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        List<String> list = new ArrayList<>();
        //배열의 각원소의 n번째 요소 접근
        for(String s : strings){
            list.add(s.charAt(n)+s);
        }
        Collections.sort(list);
        for(int i=0; i<answer.length; i++){
            answer[i]=list.get(i).substring(1);
            System.out.println(answer[i]);
        }        
        
        return answer;
    }
}