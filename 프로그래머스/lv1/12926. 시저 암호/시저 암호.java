import java.util.*;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        int bowl = 0;
        for(int i = 0; i < s.length(); i++){
            bowl = (int)s.charAt(i);
            if(bowl >= 97 && bowl <= 122){
                bowl += n;
                if(bowl > 122) bowl -= 26;
            }else if(bowl >= 65 && bowl <= 90){
                bowl += n;
                if(bowl > 90) bowl -= 26;
            }else{
                bowl = 32;
            }
            answer += (char)bowl;
        }
        return answer;
    }
}