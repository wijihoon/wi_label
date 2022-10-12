function solution(n) {
    let answer = 0;
    let bowl = Math.sqrt(n);
    if(n > 0){
        for(let i = 0; i <= bowl; i++){
            if(n%i == 0){
                if(i == n/i) answer += i;
                else answer += i + (n/i);
            }
        }
    }
    return answer;
}