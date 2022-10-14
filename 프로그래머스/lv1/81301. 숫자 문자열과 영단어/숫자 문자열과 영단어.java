class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] blow = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < blow.length; i++){
            s = s.replaceAll(blow[i], Integer.toString(i));
        }
        
        return answer = Integer.parseInt(s);
    }
}