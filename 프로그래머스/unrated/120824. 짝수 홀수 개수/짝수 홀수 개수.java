import java.util.Arrays;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] num_list) {
        return IntStream.of((int)Arrays.stream(num_list).filter(a -> a % 2 == 0).count()
                        , (int)Arrays.stream(num_list).filter(a -> a % 2 == 1).count()).toArray();
    }
}