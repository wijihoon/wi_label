import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack bowl = new Stack();
        
        for(int move : moves){
            for(int i = 0; i < board.length; i++){
                if(board[i][move - 1] != 0){
                    if(bowl.empty()){
                        bowl.push(board[i][move - 1]);
                    }else{
                        if((int)bowl.peek() == board[i][move - 1]){
                            bowl.pop();
                            answer += 2;
                        }else bowl.push(board[i][move - 1]);
                    }
                    board[i][move - 1] = 0;
                    break;
                }
            }
        }
        
        return answer;
    }
    
}