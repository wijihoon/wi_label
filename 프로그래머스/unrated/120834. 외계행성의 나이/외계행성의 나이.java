import java.util.Arrays;

class Solution {
    public String solution(int age) {
        return String.join("", Arrays.stream(Integer.toString(age).split(""))
                                     .map(a -> (char)((int)a.charAt(0) + 49)+ "")
                                     .toArray(String[]::new));
    }
}