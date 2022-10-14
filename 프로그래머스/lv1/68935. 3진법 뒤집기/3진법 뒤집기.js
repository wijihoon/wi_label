function solution(n) {
    let answer = 0;
    let bowl = n.toString(3);
    console.log(bowl + "  " + bowl.length);
    
    for(let i = bowl.length - 1; i >= 0; i--){
        console.log(bowl.substr(i, 1));
        answer += parseInt(bowl.substr(i, 1)) * Math.pow(3,i);
    }
    
    
    return answer;
}