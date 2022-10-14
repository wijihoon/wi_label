function solution(n, m) {
    let answer = [];
    for(let i = 1; i < n + 1; i++){
        if(n%i == 0 && m%i == 0) answer[0] = i;
    }
    answer[1] = n*m/answer[0];
    return answer;
}