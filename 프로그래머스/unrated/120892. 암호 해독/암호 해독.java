class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        for (int i = 1; i <= cipher.length(); i++) {
            if (i % code == 0) answer += cipher.substring(i - 1, i);        
        }
        
        return answer;
    }
}