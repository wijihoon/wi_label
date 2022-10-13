import java.util.Arrays;

class Solution {
    public String solution(String s) {
        int[] answer = Arrays.stream(s.split(" "))
                                .mapToInt(Integer::parseInt)
                                .sorted()
                                .toArray();
        return answer[0] + " " + answer[answer.length - 1];
    }
}