import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        return (int)Arrays.stream(array).filter(a -> a == n).count();
    }
}