class Solution {
    public int solution(int n) {
        int answer = 0;
        // 조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
        // 조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
        String binaryN = Integer.toBinaryString(n);
        int oneCount = 0;
        int nextCount = 0;
        for(int i = 0; i<binaryN.length(); i++){
            if(binaryN.charAt(i)=='1'){
                oneCount+=1;
            }
        }
        
        // System.out.println(oneCount);
        // 조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.
        int nextNum = n;
        while(true){
            nextNum++;
            binaryN = Integer.toBinaryString(nextNum);
            for(int i = 0; i<binaryN.length(); i++){
                if(binaryN.charAt(i)=='1'){
                    nextCount+=1;
                }
            }
            if(oneCount==nextCount){
                answer = nextNum;
                break;
            }
            nextCount = 0;
        }
        // System.out.println(answer);
        return answer;
    }
}