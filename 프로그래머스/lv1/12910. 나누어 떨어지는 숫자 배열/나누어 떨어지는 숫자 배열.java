import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).sorted().toArray();
        return answer.length == 0 ? new int[] {-1} : answer;
    }
}