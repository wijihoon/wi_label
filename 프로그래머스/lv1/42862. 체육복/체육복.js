function solution(n, lost, reserve) {
    var answer = n;
    
    for(let i = 0; i < lost.length; i++){
        for(let j = 0; j < reserve.length; j++){
            if(lost[i] == reserve[j]){
                lost[i] = 0;
                reserve[j] = 0;
                break;
            }
        }
    }
    lost    = lost.filter(a => a != 0).sort();
    reserve = reserve.filter(a => a != 0).sort();
    
    for(let i = 0; i < lost.length; i++){
        for(let j = 0; j < reserve.length; j++){
            if(lost[i] == reserve[j] - 1){
                reserve[j] = -1;
                lost[i] = -1;
                break;
            }else if(lost[i] == reserve[j] + 1){
                reserve[j] = -1;
                lost[i] = -1;
                break;
            }
        }
    }
    console.log(lost);
    console.log(reserve);
    return answer - lost.filter(a => a != -1).length;
}