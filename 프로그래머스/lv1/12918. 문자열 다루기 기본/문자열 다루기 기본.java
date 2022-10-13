import java.util.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = s.length() == 4 || s.length() == 6;
        int bowl = 0;
        for(int i = 0; i < s.length(); i++){
            try{
                bowl = Integer.parseInt(s.substring(i, i+1));
            }catch(Exception e){
                return false;
            }
        }
        return answer;
    }
}