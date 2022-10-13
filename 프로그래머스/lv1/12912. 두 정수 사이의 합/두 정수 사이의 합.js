function solution(a, b) {
    
    var answer = (a + b) * (Math.max(a, b) - Math.min(a, b) + 1)/2;
    
    return answer;
}