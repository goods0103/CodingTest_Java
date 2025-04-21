class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int len = n;
        int cola = 0;
        //빈병의개수/콜라반환병수 의 몫이 0이되지않을떄까지
        while(len/a!=0){
            int leftBottle = len%a;
            int recvCola = (len/a)*b;
            cola+=recvCola;
            len=recvCola+leftBottle;
        }
        // System.out.println(cola);
        answer = cola;
        
        return answer;
    }
}