import java.util.stream.IntStream;
import java.util.Arrays;

class Solution {
    public int solution(int i, int j, int k) {
        StringBuilder sb = new StringBuilder();
        
        while (i <= j){
            sb.append(String.valueOf(i++));    
        }
        
        return (int) Arrays.stream(sb.toString().split("")).filter(s -> String.valueOf(k).equals(s)).count();
    }
}