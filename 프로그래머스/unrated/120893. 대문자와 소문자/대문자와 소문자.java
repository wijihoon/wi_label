class Solution {
    public String solution(String my_string) {
        String[] answer = my_string.split("");
        
        for (int i = 0; i < answer.length; i++) {
            if ((int) answer[i].charAt(0) < 97) answer[i] = answer[i].toLowerCase();
            else answer[i] = answer[i].toUpperCase();
        }
        return String.join("", answer);
    }
}