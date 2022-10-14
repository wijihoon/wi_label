function solution(s) {
    var answer = s.split("");
    let cnt = 0;
    for(let i = 0; i < answer.length; i++){
        if(answer[i] != " "){
            console.log("answer[i] = " + answer[i] + " cnt = " + cnt);
            if(cnt == 0){
                answer[i] = answer[i].toUpperCase();
                cnt++;
            }else{
                answer[i] = answer[i].toLowerCase();
                cnt--;
            }    
        }else{
            cnt = 0;
        }
    }
    return answer.join("");
}