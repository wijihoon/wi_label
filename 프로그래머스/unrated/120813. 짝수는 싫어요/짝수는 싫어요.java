import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        return IntStream.range(1, n + 1).filter(a -> a % 2 == 1).toArray();
    }
}