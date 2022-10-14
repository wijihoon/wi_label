function solution(n) {
    const answer = new Array();
    
    for(let i = 0; i < n + 1; i++){
        answer.push(i);
    }
    answer[0] = -1;
    answer[1] = -1;
    
    for(let j = 2; j < Math.sqrt(answer.length); j++){
        for(let k = 2*j; k < n + 1; k += j){
            answer[k] = -1;
        }
    }
    return answer.filter(a => a != -1).length;
}