import java.util.stream.IntStream;
import java.lang.Math;

class Solution {
    public int[] solution(int money) {
        return IntStream.of((int)(Math.floor((double)money / 5500)), money % 5500).toArray();
    }
}