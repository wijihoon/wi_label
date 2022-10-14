import java.util.*;

class Solution {
    public Object[] solution(String[] strings, int n) {
        
        return Arrays.stream(strings)
                    .sorted()
                    .sorted((a, b) -> (a.substring(n, n+1)).compareTo(b.substring(n, n+1)))
                    .toArray();
    }
}