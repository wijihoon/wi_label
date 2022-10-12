import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public int[] solution(String my_string) {
        return Arrays.stream(my_string.split("")).filter(a -> (int)a.charAt(0) < 97).sorted().mapToInt(Integer::parseInt).toArray();
    }
}