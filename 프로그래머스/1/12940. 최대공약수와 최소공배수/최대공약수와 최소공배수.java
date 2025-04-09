class Solution {
    public int[] solution(int n, int m) {
        //최대공약수 구하기
        int[] answer = new int[2];
        int temp = 0;
        int a =0;
        int b=0;
        if(n>m){
            a=n;
            b=m;
        }
        else{
            a=m;
            b=n;
        }
        while(b!=0){
            temp = a%b;
            a = b;
            b = temp;
        }
        // System.out.println(a);
        //a가 최대공약수 
        //최대공배수 구하기
        b = (n*m)/a;

        answer[0] = a;
        answer[1] = b;
        
        return answer;
    }
}