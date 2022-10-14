import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        String[] strArr = s.split("");
        
        while (s.indexOf("0") > -1 || !s.equals("1")){
            answer[1] += (int) Arrays.stream(strArr).filter(a -> a.equals("0")).count();
            
            s = Integer.toBinaryString(s.replaceAll("0", "").length());
            strArr = s.split("");
            
            answer[0] += 1;
        }
        
        return answer;
    }
}