import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        PriorityQueue<String> queue = new PriorityQueue<>();
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                queue.offer(Integer.toString(numbers[i] + numbers[j]));
            }
        }
        String[] answer = new String[queue.size()];
        int cnt = 0;
        while(queue.size() > 0){
            if(answer[0] == null){
                answer[cnt] = queue.poll();
                cnt++;
            }else{
                if(queue.peek() == answer[cnt - 1]) queue.poll();
                else{
                    answer[cnt] = queue.poll();
                    cnt++;
                }
            }
        }
        
        return Arrays.stream(answer).mapToInt(Integer::parseInt).distinct().sorted().toArray();
    }
}