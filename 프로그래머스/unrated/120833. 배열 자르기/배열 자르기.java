import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.stream(numbers).skip(num1).limit(num2 - num1 + 1).toArray();
    }
}