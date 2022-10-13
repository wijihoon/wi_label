import java.util.*;

class Solution {
    public String solution(String s) {
        char[] charArr = s.toLowerCase().toCharArray();
        boolean wrapChk = true;
        
        for(int i = 0; i < charArr.length; i++){
            charArr[i] = wrapChk ? Character.toUpperCase(charArr[i]) : charArr[i];
            wrapChk = charArr[i] == ' ' ? true : false;
        }
        
        return String.valueOf(charArr);
    }
}