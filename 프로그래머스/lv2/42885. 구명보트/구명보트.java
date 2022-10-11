import java.util.Arrays;
import java.util.ArrayDeque;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int sum = 0;
        
        Arrays.sort(people);
        ArrayDeque<Integer> arrDq = new ArrayDeque<>(people.length);
        for(int i : people) arrDq.add(i);
        
        while(!arrDq.isEmpty()){
            sum = arrDq.pollLast();
            if(!arrDq.isEmpty() && sum + arrDq.peekFirst() <= limit) arrDq.pollFirst();
            answer++;
            
        }
        
        return answer;
    }
}