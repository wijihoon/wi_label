import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        PriorityQueue<String> pq = new PriorityQueue<String>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.parseInt(s2 + s1) - Integer.parseInt(s1 + s2);
            }
        });
        
        for(int i = 0; i < numbers.length; i++){
            pq.offer(Integer.toString(numbers[i]));
        }
        
        while(pq.size() > 0){
            answer += pq.poll();
        }
        
        if(answer.charAt(0) == '0'){
            return "0";
        }
        return answer;
    }
    
}