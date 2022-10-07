import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        return Arrays.stream(array).sorted().toArray()[array.length / 2];
    }
}