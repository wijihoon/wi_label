class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String bowl = "";
        int same = 0;
        s = s.toLowerCase();
        
        for(int i = 0; i < s.length(); i++){
            bowl = s.substring(i, i+1);
            if("p".equals(bowl)) same++;
            else if("y".equals(bowl)) same--;
        }
        
        return same == 0;
    }
}