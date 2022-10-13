import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        return String.join("", Arrays.stream(my_string.split("")).distinct().toArray(String[]::new));
    }
}