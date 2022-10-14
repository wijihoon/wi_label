function solution(s, n) {
    let answer = '';
    let bowl = 0;
    for(let i = 0; i < s.length; i++){
        bowl = parseInt(s.charCodeAt(i));
        if(bowl > 64 && bowl < 91){
            bowl += n;
            if(bowl > 90) bowl -= 26;
        }else if(bowl > 96 && bowl < 123){
            bowl += n;
            if(bowl > 122) bowl -= 26;
        }else{
            bowl = 32;
        }
        answer += String.fromCharCode(parseInt(bowl));
    }
    return answer;
}