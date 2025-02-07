class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int count = 0;
        for (int i = left; i <= right; i++) {
            System.out.println("i : "+ i);
            for (int t = 1; t <= i/2; t++) {
                if (i % t == 0) {
                    count++;
                    System.out.println(count);

                }
            }
            if (count % 2 == 0) {
                answer -= i;
            }
            else{
                answer += i;
            }
            System.out.println("answer"+ answer);
            count = 0;
        }
        return answer;
    }
}