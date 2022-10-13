import java.util.*;

class Solution {
    public String solution(int n) {
        String[] bowl = new String[(int)Math.round((double)n/2)];
        Arrays.fill(bowl, "수박");
        String answer = String.join("", bowl);
        return answer.substring(0,n);
    }
}