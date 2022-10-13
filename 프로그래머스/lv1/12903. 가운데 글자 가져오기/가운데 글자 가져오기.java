class Solution {
    public String solution(String s) {
        String answer = "";
        System.out.println(s.length() / 2 - (1 - (s.length() % 2)));
        System.out.println(2 - s.length() % 2);
        
        return answer = s.substring(s.length() / 2 - (1 - (s.length() % 2)), s.length() / 2 - (1 - (s.length() % 2)) + (2 - s.length() % 2));
    }
}