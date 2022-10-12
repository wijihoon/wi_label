import java.util.Arrays;
import java.util.stream.Stream;

public class Solution {
    public int solution(int n) {
        int answer = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
        return answer;
    }
}