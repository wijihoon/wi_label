import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int bowl = arr[0];
        Queue queue = new LinkedList();
        
        queue.offer(arr[0]);
        for(int i = 1; i < arr.length; i++){
            if(bowl != arr[i]){
                queue.offer(arr[i]);
            }
            bowl = arr[i];
        }
        
        int[] answer = new int[queue.size()];
        int cnt = 0;
        while(queue.size() > 0){
            answer[cnt] = (int)queue.poll();
            cnt++;
        }
            
        
        return answer;
    }
}