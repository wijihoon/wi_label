function solution(citations) {
    let answer = 0;
    citations.sort((a, b) => b - a);
    
    for(let i = 0; i < citations.length; i++){
        if(i + 1 > citations[i]){
            return i;
        }
    }
    return answer == 0 ? citations.length : answer;
}