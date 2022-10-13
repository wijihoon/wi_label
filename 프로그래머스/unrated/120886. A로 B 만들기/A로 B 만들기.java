import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        
        before = String.join("", Arrays.stream(before.split("")).sorted().toArray(String[]::new));
        after  = String.join("", Arrays.stream(after.split("")).sorted().toArray(String[]::new));
        
        return before.equals(after) ? 1 : 0;
    }
}