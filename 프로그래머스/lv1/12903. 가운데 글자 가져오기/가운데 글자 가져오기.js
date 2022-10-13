function solution(s) {
    var answer = '';
    return answer = s.substring(s.length/2 - (1 - s.length%2), s.length/2 + (2 - s.length%2) - (1 - s.length%2));
}