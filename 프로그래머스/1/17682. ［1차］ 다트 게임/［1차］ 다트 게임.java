import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String number = "";
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<dartResult.length();i++){
            char ch = dartResult.charAt(i);
            if(Character.isDigit(ch)){
                number+=ch;
            }
            else if(ch=='S'){
                al.add(Integer.parseInt(number));
                number="";
            }
            else if(ch=='D'){
                al.add((int)Math.pow(Integer.parseInt(number), 2));
                number="";
                // Math.pow(Integer.parseInt(arr[i-1]),1)
            }
            else if(ch=='T'){
                al.add((int)Math.pow(Integer.parseInt(number), 3));
                number="";
                // Math.pow(Integer.parseInt(arr[i-1]),1)
            }
            else { // 옵션
                if (ch=='*') {

                    if (al.size() == 1) {
                        al.set(al.size() - 1, al.get(al.size() - 1)*2);
                    } else {
                        al.set(al.size() - 1, al.get(al.size() - 1) * 2);
                        al.set(al.size() - 2, al.get(al.size() - 2) * 2);
                    }

                } else if (ch=='#') {
                    al.set(al.size() - 1, al.get(al.size() - 1) * -1);
                }
            }
        }

        for (int i = 0; i < al.size(); i++) {
            answer += al.get(i);
        }
        System.out.println(answer);
        return answer;
    }
}