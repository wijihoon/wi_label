import java.util.Arrays;
import java.lang.Math;

class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n + 1];
        
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                answer[i] = i;
                answer[n / i] = n / i;
            }
        }
        
        return Arrays.stream(answer).filter(a -> a != 0).toArray();
    }
}