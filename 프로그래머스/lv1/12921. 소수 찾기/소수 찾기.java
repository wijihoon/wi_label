import java.util.*;

class Solution {
    public int solution(int n) {
        int[] answer = new int[n + 1];
        answer[0] = 1;
        answer[1] = 1;
        
        for(int i = 2; i < Math.sqrt(n) + 1; i++){
            for(int j = 2*i; j < n + 1; j+=i){
                answer[j] = 1;
            }
        }
        return Math.toIntExact(Arrays.stream(answer).filter(a -> a != 1).count());
    }
}