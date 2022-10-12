function solution(n) {
    var answer = n.toString().split("").reverse().map(a => parseInt(a));
    return answer;
}