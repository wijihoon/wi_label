function solution(arr) {
    var answer = arr.reduce((a, b) => a+b, 0)/arr.length;
    return answer;
}