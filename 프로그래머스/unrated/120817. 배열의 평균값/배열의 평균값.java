import java.util.Arrays;

class Solution {
    public double solution(int[] numbers) {
        double answer = (double)Arrays.stream(numbers).sum() / numbers.length;
        return answer;
    }
}