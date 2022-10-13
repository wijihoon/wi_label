function solution(s) {
    var answer = s.length == 4 || s.length == 6;
    for(let i = 0; i < s.length; i++){
        if(isNaN(parseInt(s.substr(i, 1)))){
            return false;
        }
    }
    return answer;
}