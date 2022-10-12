function solution(x) {
    var answer = x%x.toString()
                    .split("")
                    .map(i => parseInt(i))
                    .reduce((a,b) => a+b,0) == 0 ? true : false;
    return answer;
}