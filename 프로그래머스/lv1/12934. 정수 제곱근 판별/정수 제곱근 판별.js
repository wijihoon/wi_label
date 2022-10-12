function solution(n) {
    var answer = n == Math.pow(parseInt(Math.sqrt(n)), 2) ? Math.pow(parseInt(Math.sqrt(n)) + 1, 2) : -1 ;
    return answer;
}