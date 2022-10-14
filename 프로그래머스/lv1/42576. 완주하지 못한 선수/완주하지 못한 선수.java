import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i = 0; i < completion.length; i++){
            if(!completion[i].equals(participant[i])) return answer = participant[i];
        }
        return answer = participant[completion.length];
    }
}