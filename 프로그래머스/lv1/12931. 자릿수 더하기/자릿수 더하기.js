function solution(n){
    var answer = n.toString().split("").reduce((a,b) => parseInt(a) + parseInt(b), 0);
    return answer;
}