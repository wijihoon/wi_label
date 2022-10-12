import java.util.stream.Collectors;
import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = Long.parseLong(Arrays.stream(String.valueOf(n).split(""))
                                       .sorted((a,b) -> b.compareTo(a))
                                       .collect(Collectors.joining()));
        return answer;
    }
}