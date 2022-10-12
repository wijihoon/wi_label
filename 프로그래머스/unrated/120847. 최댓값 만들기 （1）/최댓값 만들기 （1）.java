import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        return (int)Arrays.stream(numbers).sorted().skip(numbers.length - 2).reduce(1, (a, b) -> a * b);
    }
}