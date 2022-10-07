import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] intArr = {(int)Arrays.stream(num_list).filter(a -> a % 2 == 0).count(), (int)Arrays.stream(num_list).filter(a -> a % 2 == 1).count()};
        return intArr;
    }
}