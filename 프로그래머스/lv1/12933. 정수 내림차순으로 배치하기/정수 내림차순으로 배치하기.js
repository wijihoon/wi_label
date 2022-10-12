function solution(n) {
    var answer = parseInt(n.toString().split("").sort((a,b) => b-a).join(""));
    return answer;
}