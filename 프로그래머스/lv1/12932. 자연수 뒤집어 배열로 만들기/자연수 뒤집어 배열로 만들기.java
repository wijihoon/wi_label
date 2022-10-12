import java.util.stream.Stream;

class Solution {
    public int[] solution(long n) {
        StringBuffer sb = new StringBuffer(String.valueOf(n));
        int[] answer = Stream.of(String.valueOf(sb.reverse()).split("")).mapToInt(Integer::parseInt).toArray();
        return answer;
    }
}