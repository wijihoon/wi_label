import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        //Queue solution
        Queue pricesQueue = new LinkedList();

        for(int price : prices){
            pricesQueue.offer(price);
        }
        
        int[] answer = new int[prices.length];
        int term = 0;
        int answerCnt = 0;
        Object pricesQueuePoll;
        while(!pricesQueue.isEmpty()){
            term = 0;
            pricesQueuePoll = pricesQueue.poll();
            for(int i = answerCnt + 1; i < prices.length; i++){
                if((int)pricesQueuePoll <= prices[i]) term++;
                else{
                    term++;
                    break;   
                }
            }
            answer[answerCnt] = term;
            answerCnt++;
        }
       
        return answer;
    }
}