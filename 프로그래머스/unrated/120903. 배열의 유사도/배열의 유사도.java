import java.util.Arrays;
import java.util.function.Predicate;

class Solution {
    public int solution(String[] s1, String[] s2) {
        return (int)Arrays.stream(s1).filter(a -> Arrays.stream(s2).anyMatch(Predicate.isEqual(a))).count();
    }
}