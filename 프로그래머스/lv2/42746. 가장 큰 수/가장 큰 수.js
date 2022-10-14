function solution(numbers) {
    let answer = '';
    numbers.sort((s1, s2) => {
        if((s1.toString() + s2.toString()) > (s2.toString() + s1.toString())){
            return -1;
        }else{
            return 1;
        }
    });
    
    for(let str of numbers){
        answer += str;
    }
    
    if(answer.charAt(0) == '0'){
        return "0";
    }
    return answer;
}