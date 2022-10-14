function solution(board, moves) {
    var answer = 0;
    var stack  = [];
    
    for(var i = 0; i < moves.length; i++){
        var now = moves[i]-1
        for(var j = 0;j < board.length; j++){
            if(board[j][now] != 0){
                if(stack[stack.length-1] === board[j][now]){
                    stack.pop();
                    answer += 2;
                }
                else{
                    stack.push(board[j][now])
                }
                board[j][now] = 0;
                break;
            }
        }
    }
    return answer
}