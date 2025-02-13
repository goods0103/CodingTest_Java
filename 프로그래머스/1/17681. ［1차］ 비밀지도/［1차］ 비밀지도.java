class Solution {
    public String[] solution(int n, int [] arr1, int [] arr2) {
        String[] answer = new String[n];
        for(int i=0; i<arr1.length; i++){
            int temp = arr1[i] | arr2[i];
            //2진수 변환
            String s = String.format("%"+n+"s", Integer.toBinaryString(arr1[i]|arr2[i]));
            // String s3 = String.format("%"+n+"d",Long.parseLong(Integer.toBinaryString(arr1[i])));
            System.out.println("arr1 : "+arr1[i]);
            System.out.println("arr2 : "+arr2[i]);
            // System.out.println(arr2[i]+arr1[i]);
            answer[i] = s.replace("0", " ");
            answer[i] = answer[i].replace("1", "#");
            // answer[i] = Integer.toString((arr2[i]+arr1[i])).replace("0", " ");
            System.out.println("ans length: "+answer[i].length());

            // while(answer[i].length()<6){
            //     answer[i]=" "+answer[i];
            // }
            System.out.println("ans length: "+answer[i].length());

            System.out.println("ans : "+answer[i]);
        }
        return answer;
    }
}