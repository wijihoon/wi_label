import java.util.Arrays;

class Solution {
    public int solution(int order) {
        System.out.println(0%3);
        return (int) Arrays.stream(Integer.toString(order).split(""))
                           .filter(a -> Integer.parseInt(a) % 3 == 0 && !"0".equals(a))
                           .count();
    }
}