class Solution {
    boolean solution(String s) {
        int bracket = 0;
        
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                bracket++;
            } else if (ch == ')') {
                bracket--;
            }
            
            if(bracket < 0) { return false; }
        }

        return bracket == 0 ? true : false;
    }
}