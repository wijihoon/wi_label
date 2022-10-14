import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) { // 섞은 음식 스코빌 지수 = scoville + (K * 2)
        int answer = 0;
        //int형 priorityQueue 선언 (우선순위가 낮은 숫자 순)
        PriorityQueue<Integer> scovilleBowl = new PriorityQueue<>();
        if(scoville[0] == 0){
            return -1;
        }else{
            for(int i = 0; i < scoville.length; i++){
                scovilleBowl.add(scoville[i]);
            }
            while(true){
                if(scovilleBowl.size() > 1){
                    if(scovilleBowl.peek() < K){
                        scovilleBowl.add(scovilleBowl.poll() + (scovilleBowl.poll() * 2));
                        answer++;
                    }else{  
                        return answer;
                    }    
                }else{
                    if(scovilleBowl.peek() < K){
                        return -1;    
                    }else{
                        return answer;
                    }
                    
                }
            }
        }
    }
}