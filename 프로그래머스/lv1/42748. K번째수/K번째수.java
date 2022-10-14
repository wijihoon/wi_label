import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] bowl = {};
        int bowlCnt = 0;
        for(int i = 0; i < commands.length; i++){
            bowl = new int[commands[i][1] - commands[i][0] + 1];
            for(int j = commands[i][0] - 1; j < commands[i][1]; j++){
                bowl[bowlCnt] = array[j];
                bowlCnt++;
            }
            Arrays.sort(bowl);
            answer[i] = bowl[commands[i][2] - 1];
            bowlCnt = 0;
        }
        return answer;
    }
}