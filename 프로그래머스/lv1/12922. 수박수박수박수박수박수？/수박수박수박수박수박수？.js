function solution(n) {
    var answer = [...Array(Math.round(n/2)).fill("수박")];
    return answer.join("").substr(0, n);
}