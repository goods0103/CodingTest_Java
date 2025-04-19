class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        //카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.
        int x = 0; 
        int y = 0;
        //yellow의 약수 구하기 
        for(int i =1 ; i<=yellow; i++){
            if(yellow%i==0){
                //몫과 나머지중 크거나 같은값이 가로
                int q = yellow/i;
                if(i>=q){
                    x=i+2;
                    y=q+2;
                }
                else if(q>=i){
                    x=q+2;
                    y=i+2;
                }
                //(가로축+2)*(세로축+2)=brown일때 정답..
                if(brown==(x*y)-(q*i)){                    
                    answer[0]=x;
                    answer[1]=y;
                    // System.out.println("x: "+ x + " y: "+ y);
                    // System.out.println("q: "+ q + " i: "+ i);
                }
            }
        }
        return answer;
    }
}