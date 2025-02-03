function solution(n) {
    var answer = 0;
    var pre=1, cur =0, last=0
    for(var i=2;i<=n;i++){
        cur = (pre + last)%1234567
        last = pre%1234567
        pre = cur%1234567
        
    }
    answer = cur
    return answer;

}