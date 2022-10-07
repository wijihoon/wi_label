
import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        return (int)Arrays.stream(array).filter(a -> height < a).count();
    }
}