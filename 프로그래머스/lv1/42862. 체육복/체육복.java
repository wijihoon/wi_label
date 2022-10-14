import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int sameCnt = 0;
        int bowl = 0;
        PriorityQueue<Integer> lostQueue = new PriorityQueue<>();
        
        for(int losts : lost){
            for(int i = 0; i < reserve.length; i++){
                if(losts == reserve[i]){
                    reserve[i] = 0;
                    sameCnt++;
                    break;
                }
            }
            if(sameCnt > 0) sameCnt = 0;
            else lostQueue.offer(losts);
        }
        
        reserve = Arrays.stream(reserve).filter(a -> a != 0).sorted().toArray();
        
        while(lostQueue.size() > 0){ //중복되지않은 lost, reserve
            bowl = lostQueue.poll();
            
            for(int i = 0; i < reserve.length; i++){
                System.out.println("lostQueue = " + bowl + " reserve[" + i + "] = " +  reserve[i]);
                if(bowl == reserve[i] - 1){
                    reserve[i] = -1;
                    sameCnt++;
                    break;
                }else if(bowl == reserve[i] + 1){
                    reserve[i] = -1;
                    sameCnt++;
                    break; 
                }
            }
            if(sameCnt == 0){
                answer--;
            }else{
                sameCnt = 0;
            }
        }
        return answer;
    }
}