function solution(array, commands) {
    let answer = [];
    let bowl = [];
    let cnt = 0;
    while(cnt < commands.length){
        for(let i = commands[cnt][0] - 1; i < commands[cnt][1]; i++){
           bowl.push(array[i]);
        }
        bowl.sort((a, b) => a-b);
        console.log(bowl);
        answer[cnt] = bowl[commands[cnt][2] - 1];
        bowl = [];
        cnt++;
    }
    
    return answer;
}