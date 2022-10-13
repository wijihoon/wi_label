import java.lang.Math;

class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(int) Math.ceil((double) my_str.length() / n)];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = my_str.substring(i * n, i * n + n > my_str.length() 
                                                          ? my_str.length()
                                                          : i * n + n);
        }
        
        return answer;
    }
}